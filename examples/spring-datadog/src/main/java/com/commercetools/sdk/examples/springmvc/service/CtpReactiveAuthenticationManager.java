package com.commercetools.sdk.examples.springmvc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.cart.CartReferenceBuilder;
import com.commercetools.api.models.customer.CustomerSignInResult;
import com.commercetools.api.models.customer.MyCustomerSigninBuilder;

import com.commercetools.sdk.examples.springmvc.config.CtpUserDetails;
import com.commercetools.sdk.examples.springmvc.config.TokenGrantedAuthority;
import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.GlobalCustomerPasswordTokenSupplier;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import reactor.core.publisher.Mono;

public class CtpReactiveAuthenticationManager implements ReactiveAuthenticationManager {
    VrapHttpClient client;
    ProjectApiRoot apiRoot;

    private final ClientCredentials credentials;

    private final String projectKey;

    public CtpReactiveAuthenticationManager(final ProjectApiRoot apiRoot, final ClientCredentials credentials,
            final String projectKey) {
        this.apiRoot = apiRoot;
        this.client = HttpClientSupplier.of().get();
        this.credentials = credentials;
        this.projectKey = projectKey;
    }

    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {
        if (authentication instanceof UsernamePasswordAuthenticationToken) {
            if (authentication.getCredentials() == null || authentication.getPrincipal() == null) {
                return Mono.defer(() -> Mono.error(new BadCredentialsException("Invalid Credentials")));
            }
            MyCustomerSigninBuilder customerSignin = MyCustomerSigninBuilder.of()
                    .email(authentication.getName())
                    .password(authentication.getCredentials().toString());

            return Mono
                    .fromFuture(
                        apiRoot.me().login().post(customerSignin.build()).execute().exceptionally(throwable -> null))
                    .flatMap(customerSignInResultApiHttpResponse -> {
                        GlobalCustomerPasswordTokenSupplier supplier = new GlobalCustomerPasswordTokenSupplier(
                            credentials.getClientId(), credentials.getClientSecret(), authentication.getName(),
                            authentication.getCredentials().toString(), null,
                            ServiceRegion.GCP_EUROPE_WEST1.getPasswordFlowTokenURL(projectKey), client);

                        return Mono.zip(Mono.fromFuture(supplier.getToken().exceptionally(throwable -> null)),
                            Mono.just(customerSignInResultApiHttpResponse.getBody()));
                    })
                    .switchIfEmpty(Mono.defer(() -> Mono.error(new BadCredentialsException("Invalid Credentials"))))
                    .map(tokenSignin -> {
                        final AuthenticationToken token = tokenSignin.getT1();
                        final CustomerSignInResult signinResult = tokenSignin.getT2();

                        final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
                        GrantedAuthority authority = new TokenGrantedAuthority("ROLE_USER", token);
                        Collection<GrantedAuthority> updatedAuthorities = new ArrayList<>();
                        updatedAuthorities.add(authority);
                        updatedAuthorities.addAll(authorities);

                        return new UsernamePasswordAuthenticationToken(new CtpUserDetails(signinResult.getCustomer(),
                            Optional.ofNullable(signinResult.getCart())
                                    .map(c -> CartReferenceBuilder.of().id(c.getId()).build())
                                    .orElse(null),
                            updatedAuthorities), "", updatedAuthorities);
                    });
        }
        return Mono.defer(() -> Mono.error(new BadCredentialsException("Invalid authentication")));
    }
}
