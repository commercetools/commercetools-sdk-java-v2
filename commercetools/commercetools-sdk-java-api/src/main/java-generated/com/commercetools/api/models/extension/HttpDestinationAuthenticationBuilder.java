
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * HttpDestinationAuthenticationBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HttpDestinationAuthenticationBuilder {

    public com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder authorizationHeaderBuilder() {
        return com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder.of();
    }

    public com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder azureFunctionsBuilder() {
        return com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder.of();
    }

    public static HttpDestinationAuthenticationBuilder of() {
        return new HttpDestinationAuthenticationBuilder();
    }
}
