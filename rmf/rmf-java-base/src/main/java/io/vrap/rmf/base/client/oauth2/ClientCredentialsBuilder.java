package io.vrap.rmf.base.client.oauth2;

import java.util.Objects;

public class ClientCredentialsBuilder {
    private String clientId;
    private String clientSecret;
    private String scopes;

    public ClientCredentialsBuilder() {}

    public ClientCredentialsBuilder withClientId(final String clientId) {
        this.clientId = clientId;
        return this;
    }

    public ClientCredentialsBuilder withClientSecret(final String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public ClientCredentialsBuilder withScopes(final String scopes) {
        this.scopes = scopes;
        return this;
    }

    public ClientCredentialsImpl build() {
        Objects.requireNonNull(this.clientId);
        Objects.requireNonNull(this.clientSecret);
        return new ClientCredentialsImpl(clientId, clientSecret, scopes);
    }
}
