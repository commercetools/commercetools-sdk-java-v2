
package com.commercetools.api.models.quote;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
