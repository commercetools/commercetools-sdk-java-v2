
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetCustomFieldAction stagedQuoteSetCustomFieldAction = StagedQuoteSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteSetCustomFieldActionImpl.class)
public interface StagedQuoteSetCustomFieldAction extends StagedQuoteUpdateAction {

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

    public static StagedQuoteSetCustomFieldAction of() {
        return new StagedQuoteSetCustomFieldActionImpl();
    }

    public static StagedQuoteSetCustomFieldAction of(final StagedQuoteSetCustomFieldAction template) {
        StagedQuoteSetCustomFieldActionImpl instance = new StagedQuoteSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StagedQuoteSetCustomFieldActionBuilder builder() {
        return StagedQuoteSetCustomFieldActionBuilder.of();
    }

    public static StagedQuoteSetCustomFieldActionBuilder builder(final StagedQuoteSetCustomFieldAction template) {
        return StagedQuoteSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withStagedQuoteSetCustomFieldAction(Function<StagedQuoteSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteSetCustomFieldAction>";
            }
        };
    }
}
