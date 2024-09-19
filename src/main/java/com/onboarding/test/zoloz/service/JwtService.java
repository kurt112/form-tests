package com.onboarding.test.zoloz.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

@Service
public class JwtService {
    @Value("${security.jwt.secret-key}")
    private String secretKey;

    @Value("${security.jwt.expiration-time}")
    private long jwtExpiration;

//    public String extractUsername(String token) {
//        return extractClaim(token, Claims::getSubject);
//    }
//
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    public String generateTokenTransferDevice(final String orn){
        return this.generateTokenTransferDevice(new HashMap<>(), orn);
    }

    public String generateSourceOfApplicationToken(final String origin,final int selectedCard){
        return this.generateTokenForSourceOfApplication(new HashMap<>(), origin,selectedCard);
    }


//    public String generateToken(UserDetails userDetails) {
//        return generateToken(new HashMap<>(), userDetails);
//    }

//    public String generateToken(Map<String, Object> extraClaims, UserDetails userDetails) {
//        return buildToken(extraClaims, userDetails, jwtExpiration);
//    }
    private String generateTokenTransferDevice(Map<String, Object> extraClaims, String orn) {
          extraClaims.put("orn", orn);
          extraClaims.put("generated-link", UUID.randomUUID());
          return buildToken(extraClaims, orn, jwtExpiration);
    }
    private String generateTokenForSourceOfApplication(Map<String, Object> extraClaims, String origin, int selectedCard) {

        extraClaims.put("generated-link", UUID.randomUUID());
        extraClaims.put("link-origin", origin);
        extraClaims.put("selected-card", selectedCard);
        return buildToken(extraClaims, origin, jwtExpiration);
    }


    public long getExpirationTime() {
        return jwtExpiration;
    }

//    private String buildToken(
//            Map<String, Object> extraClaims,
//            UserDetails userDetails,
//            long expiration
//    ) {
//        return Jwts
//                .builder()
//                .setClaims(extraClaims)
//                .setSubject(userDetails.getUsername())
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + expiration))
//                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
//                .compact();
//    }
private String buildToken(
        Map<String, Object> extraClaims,
        String orn,
        long expiration
) {
    SecretKey key = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));

    return Jwts
            .builder()
            .claims(extraClaims)
            .subject(orn)
            .issuedAt(new Date(System.currentTimeMillis()))
            .expiration(new Date(System.currentTimeMillis() + 600000))
            .signWith(key)
            .compact();
}

//    public boolean isTokenValid(String token, UserDetails userDetails) {
//        final String username = extractUsername(token);
//        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
//    }
//
//    private boolean isTokenExpired(String token) {
//        return extractExpiration(token).before(new Date());
//    }
//
//    private Date extractExpiration(String token) {
//        return extractClaim(token, Claims::getExpiration);
//    }
//
    public Claims extractAllClaims(String token) {
        SecretKey key = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));
        return Jwts
                .parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
//
//    private Key getSignInKey() {
//        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
//        return Keys.hmacShaKeyFor(keyBytes);
//    }
}
