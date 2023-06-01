package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.AuthorizationHeaderAuthentication;
import com.commercetools.api.models.extension.AzureFunctionsAuthentication;
import com.commercetools.api.models.extension.HttpDestinationAuthentication;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * HttpDestinationAuthenticationBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class HttpDestinationAuthenticationBuilder {

    public com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder authorizationHeaderBuilder() {
       return com.commercetools.api.models.extension.AuthorizationHeaderAuthenticationBuilder.of();
    }
    public com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder azureFunctionsBuilder() {
       return com.commercetools.api.models.extension.AzureFunctionsAuthenticationBuilder.of();
    }

    /**
     * factory method for an instance of HttpDestinationAuthenticationBuilder
     * @return builder 
     */
    public static HttpDestinationAuthenticationBuilder of() {
        return new HttpDestinationAuthenticationBuilder();
    }

}
