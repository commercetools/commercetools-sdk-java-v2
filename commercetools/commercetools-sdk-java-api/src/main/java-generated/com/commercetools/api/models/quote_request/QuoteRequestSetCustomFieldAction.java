
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestSetCustomFieldAction quoteRequestSetCustomFieldAction = QuoteRequestSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestSetCustomFieldActionImpl.class)
public interface QuoteRequestSetCustomFieldAction extends QuoteRequestUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static QuoteRequestSetCustomFieldAction of() {
        return new QuoteRequestSetCustomFieldActionImpl();
    }

    public static QuoteRequestSetCustomFieldAction of(final QuoteRequestSetCustomFieldAction template) {
        QuoteRequestSetCustomFieldActionImpl instance = new QuoteRequestSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static QuoteRequestSetCustomFieldActionBuilder builder() {
        return QuoteRequestSetCustomFieldActionBuilder.of();
    }

    public static QuoteRequestSetCustomFieldActionBuilder builder(final QuoteRequestSetCustomFieldAction template) {
        return QuoteRequestSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withQuoteRequestSetCustomFieldAction(Function<QuoteRequestSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestSetCustomFieldAction>";
            }
        };
    }
}
