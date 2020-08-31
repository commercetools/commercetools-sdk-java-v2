package io.vrap.rmf.base.client.oauth2;

public interface ClientCredentials {
    String getClientId();

    String getClientSecret();

    String getScopes();

    static ClientCredentialsBuilder of() {
        return new ClientCredentialsBuilder();
    }
}
