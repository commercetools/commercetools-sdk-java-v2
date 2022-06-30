
package com.commercetools.api.models.quote;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteUpdateActionBuilder {

    public com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder changeQuoteStateBuilder() {
        return com.commercetools.api.models.quote.QuoteChangeQuoteStateActionBuilder.of();
    }

    public com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.quote.QuoteSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.quote.QuoteSetCustomTypeActionBuilder.of();
    }

    public static QuoteUpdateActionBuilder of() {
        return new QuoteUpdateActionBuilder();
    }
}
