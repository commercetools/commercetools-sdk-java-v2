package io.vrap.rmf.base.client.oauth2;

public class ClientCredentialsImpl implements ClientCredentials {
    private final String clientId;
    private final String clientSecret;
    private final String scopes;

    ClientCredentialsImpl(final String clientId, final String clientSecret, final String scopes) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scopes = scopes;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public String getClientSecret() {
        return clientSecret;
    }

    @Override
    public String getScopes() {
        return scopes;
    }
}
