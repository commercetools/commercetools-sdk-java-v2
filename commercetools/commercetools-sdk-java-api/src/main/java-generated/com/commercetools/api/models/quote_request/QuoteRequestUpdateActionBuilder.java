
package com.commercetools.api.models.quote_request;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestUpdateActionBuilder {

    public com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder changeQuoteRequestStateBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestChangeQuoteRequestStateActionBuilder.of();
    }

    public com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeActionBuilder.of();
    }

    public static QuoteRequestUpdateActionBuilder of() {
        return new QuoteRequestUpdateActionBuilder();
    }
}
