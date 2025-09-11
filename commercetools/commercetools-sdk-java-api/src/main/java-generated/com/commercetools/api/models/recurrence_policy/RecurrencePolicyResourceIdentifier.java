
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyResourceIdentifier recurrencePolicyResourceIdentifier = RecurrencePolicyResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("recurrence-policy")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicyResourceIdentifierImpl.class)
public interface RecurrencePolicyResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for RecurrencePolicyResourceIdentifier
     */
    String RECURRENCE_POLICY = "recurrence-policy";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of RecurrencePolicyResourceIdentifier
     */
    public static RecurrencePolicyResourceIdentifier of() {
        return new RecurrencePolicyResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicyResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicyResourceIdentifier of(final RecurrencePolicyResourceIdentifier template) {
        RecurrencePolicyResourceIdentifierImpl instance = new RecurrencePolicyResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public RecurrencePolicyResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicyResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicyResourceIdentifier deepCopy(
            @Nullable final RecurrencePolicyResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicyResourceIdentifierImpl instance = new RecurrencePolicyResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicyResourceIdentifier
     * @return builder
     */
    public static RecurrencePolicyResourceIdentifierBuilder builder() {
        return RecurrencePolicyResourceIdentifierBuilder.of();
    }

    /**
     * create builder for RecurrencePolicyResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyResourceIdentifierBuilder builder(final RecurrencePolicyResourceIdentifier template) {
        return RecurrencePolicyResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicyResourceIdentifier(Function<RecurrencePolicyResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicyResourceIdentifier>";
            }
        };
    }
}
