
package io.vrap.rmf.base.client;

import java.time.ZonedDateTime;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(final String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(final Long expiresIn) {
        this.expiresInZonedDateTime = Optional.ofNullable(expiresIn)
                .map(seconds -> ZonedDateTime.now().plusSeconds(seconds).minusMinutes(5))
                .orElse(null);
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public String getRefresherToken() {
        return refresherToken;
    }

    public void setRefresherToken(final String refresherToken) {
        this.refresherToken = refresherToken;
    }

    public ZonedDateTime getExpiresInZonedDateTime() {
        return expiresInZonedDateTime;
    }

    public boolean isExpired() {
        return expiresInZonedDateTime != null && expiresInZonedDateTime.isBefore(ZonedDateTime.now());
    }
}
