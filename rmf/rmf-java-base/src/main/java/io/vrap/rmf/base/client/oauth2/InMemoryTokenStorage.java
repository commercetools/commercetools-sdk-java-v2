
package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.AuthenticationToken;

public class InMemoryTokenStorage implements TokenStorage {
    private AuthenticationToken token;

    public InMemoryTokenStorage() {
    }

    public InMemoryTokenStorage(AuthenticationToken token) {
        this.token = token;
    }

    @Override
    public AuthenticationToken getToken() {
        return token;
    }

    @Override
    public void setToken(AuthenticationToken token) {
        synchronized (this) {
            this.token = token;
        }
    }
}
