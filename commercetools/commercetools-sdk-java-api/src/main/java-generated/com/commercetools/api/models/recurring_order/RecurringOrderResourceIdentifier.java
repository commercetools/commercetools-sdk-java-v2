
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a RecurringOrder. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderResourceIdentifier recurringOrderResourceIdentifier = RecurringOrderResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("recurring-order")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderResourceIdentifierImpl.class)
public interface RecurringOrderResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for RecurringOrderResourceIdentifier
     */
    String RECURRING_ORDER = "recurring-order";

    /**
     *  <p>Unique identifier of the referenced RecurringOrder. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced RecurringOrder. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced RecurringOrder. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced RecurringOrder. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of RecurringOrderResourceIdentifier
     */
    public static RecurringOrderResourceIdentifier of() {
        return new RecurringOrderResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderResourceIdentifier of(final RecurringOrderResourceIdentifier template) {
        RecurringOrderResourceIdentifierImpl instance = new RecurringOrderResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public RecurringOrderResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderResourceIdentifier deepCopy(@Nullable final RecurringOrderResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        RecurringOrderResourceIdentifierImpl instance = new RecurringOrderResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderResourceIdentifier
     * @return builder
     */
    public static RecurringOrderResourceIdentifierBuilder builder() {
        return RecurringOrderResourceIdentifierBuilder.of();
    }

    /**
     * create builder for RecurringOrderResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderResourceIdentifierBuilder builder(final RecurringOrderResourceIdentifier template) {
        return RecurringOrderResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderResourceIdentifier(Function<RecurringOrderResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderResourceIdentifier>";
            }
        };
    }
}
