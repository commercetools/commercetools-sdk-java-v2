
package com.commercetools.docs.meta;

import java.net.URI;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.ClientBuilder;
import io.vrap.rmf.base.client.ServiceRegionConfig;
import io.vrap.rmf.base.client.oauth2.AnonymousFlowTokenSupplier;
import io.vrap.rmf.base.client.oauth2.AnonymousSessionTokenSupplier;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.GlobalCustomerPasswordTokenSupplier;
import io.vrap.rmf.base.client.oauth2.RefreshFlowTokenSupplier;
import io.vrap.rmf.base.client.oauth2.TokenStorage;

/**
 * {@include.toc}
 * <h2 id="authorization">Authentication</h2>
 *
 * <h3 id="client-credentials">Client credentials flow</h3>
 *
 * <p>The {@link ApiRootBuilder#defaultClient(ClientCredentials, ServiceRegionConfig)} and the {@link ClientBuilder#defaultClient(ClientCredentials, ServiceRegionConfig)} methods
 * will configure the client to use client credentials flow for authenthication. To explicitly configure this flow use the
 * {@link ApiRootBuilder#withClientCredentialsFlow(ClientCredentials, URI)} methods</p>
 *
 * <h3 id="static-token">Static token</h3>
 *
 * <p>When you want to use a static token e.g. provided by an external oauth service you can use the {@link ApiRootBuilder#withStaticTokenFlow(AuthenticationToken)}
 * method to configure the client with the existing token.</p>
 *
 * <h3 id="anonymous-refresh">Anonymous and RefreshToken flow</h3>
 *
 * <p>The {@link ApiRootBuilder#withAnonymousRefreshFlow(ClientCredentials, ServiceRegion, TokenStorage)}
 * methods configure a stack of TokenProviders which first try to get a token from the TokenStorage. If there is no token
 * it will request a token using {@link AnonymousFlowTokenSupplier anonymous token flow}.
 * If the token is invalid the {@link RefreshFlowTokenSupplier} will try to refresh the token.</p>
 *
 * <p>This method can be combined with th {@link GlobalCustomerPasswordTokenSupplier} to request
 * a customer bound token and save it in the {@link TokenStorage}.</p>
 *
 * <h4 id="anonymous-session">Standalone anonymous session flow</h4>
 *
 * <p>The {@link AnonymousSessionTokenSupplier} requests an anonymous token only without
 * fallback to a refresh token flow. This supplier can be configured with {@link ApiRootBuilder#withAnonymousSessionFlow(ClientCredentials, String)}</p>
 *
 * <h4 id="password-flow">Password flow</h4>
 *
 * <p>The {@link ApiRootBuilder#withGlobalCustomerPasswordFlow(ClientCredentials, String, String, String)} method can be used
 * to configure a client with a token issued to a specific customer. It will configure the client to use the {@link GlobalCustomerPasswordTokenSupplier}
 * for authentication.</p>
 *
 * <h3 id="introspection">Introspection</h3>
 *
 * <p>The token introspection provided by the API can't be used directly with the SDK clients. You will have to call
 * the introspection endpoint with the token to check separately.</p>
 *
 * {@include.example commercetools.AuthEndpointsTest#introspection()}
 *
 * <h3 id="revoke">Token revocation</h3>
 *
 * <p>The token revocation provided by the API can't be used directly with the SDK client. You will have to call
 * the endpoint with the token to be revoked separately.</p>
 *
 * {@include.example commercetools.AuthEndpointsTest#revoke()}
 */
public class Authentication {
}
