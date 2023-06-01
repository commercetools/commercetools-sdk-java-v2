package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.quote_request.QuoteRequestChangeCustomerAction;
import com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateAction;
import com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldAction;
import com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeAction;
import com.commercetools.api.models.quote_request.QuoteRequestTransitionStateAction;
import com.commercetools.api.models.quote_request.QuoteRequestUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestUpdateActionBuilder {

    public com.commercetools.api.models.quote_request.QuoteRequestChangeCustomerActionBuilder changeCustomerBuilder() {
       return com.commercetools.api.models.quote_request.QuoteRequestChangeCustomerActionBuilder.of();
    }
    public com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder changeQuoteRequestStateBuilder() {
       return com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder.of();
    }
    public com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.quote_request.QuoteRequestTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.quote_request.QuoteRequestTransitionStateActionBuilder.of();
    }

    /**
     * factory method for an instance of QuoteRequestUpdateActionBuilder
     * @return builder 
     */
    public static QuoteRequestUpdateActionBuilder of() {
        return new QuoteRequestUpdateActionBuilder();
    }

}
