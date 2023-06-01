package com.commercetools.api.models.quote;

import com.commercetools.api.models.quote.QuoteChangeCustomerAction;
import com.commercetools.api.models.quote.QuoteChangeQuoteStateAction;
import com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationAction;
import com.commercetools.api.models.quote.QuoteSetCustomFieldAction;
import com.commercetools.api.models.quote.QuoteSetCustomTypeAction;
import com.commercetools.api.models.quote.QuoteTransitionStateAction;
import com.commercetools.api.models.quote.QuoteUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteUpdateActionBuilder {

    public com.commercetools.api.models.quote.QuoteChangeCustomerActionBuilder changeCustomerBuilder() {
       return com.commercetools.api.models.quote.QuoteChangeCustomerActionBuilder.of();
    }
    public com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder changeQuoteStateBuilder() {
       return com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder.of();
    }
    public com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationActionBuilder requestQuoteRenegotiationBuilder() {
       return com.commercetools.api.models.quote.QuoteRequestQuoteRenegotiationActionBuilder.of();
    }
    public com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.quote.QuoteTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.quote.QuoteTransitionStateActionBuilder.of();
    }

    /**
     * factory method for an instance of QuoteUpdateActionBuilder
     * @return builder 
     */
    public static QuoteUpdateActionBuilder of() {
        return new QuoteUpdateActionBuilder();
    }

}
