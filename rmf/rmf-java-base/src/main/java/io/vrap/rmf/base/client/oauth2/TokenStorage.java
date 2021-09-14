
package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.AuthenticationToken;

public interface TokenStorage {
    AuthenticationToken getToken();

    void setToken(AuthenticationToken token);
}
