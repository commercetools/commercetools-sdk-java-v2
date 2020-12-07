package io.vrap.rmf.base.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;
import java.util.Optional;

public class AuthenticationToken {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private Long expiresIn;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("refresh_token")
    private String refresherToken;

    @JsonIgnore
    private ZonedDateTime expiresInZonedDateTime;

    public AuthenticationToken() {
        expiresInZonedDateTime = ZonedDateTime.now();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresInZonedDateTime = Optional.ofNullable(expiresIn).map(seconds -> ZonedDateTime.now().plusSeconds(seconds).minusMinutes(5)).orElse(ZonedDateTime.now());
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRefresherToken() {
        return refresherToken;
    }

    public void setRefresherToken(String refresherToken) {
        this.refresherToken = refresherToken;
    }

    public ZonedDateTime getExpiresInZonedDateTime() {
        return expiresInZonedDateTime;
    }

    public boolean isExpired() {
        return expiresInZonedDateTime.isBefore(ZonedDateTime.now());
    }
}
