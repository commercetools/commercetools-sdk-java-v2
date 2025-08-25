
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to an <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditResourceIdentifier orderEditResourceIdentifier = OrderEditResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("order-edit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditResourceIdentifierImpl.class)
public interface OrderEditResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<OrderEdit> {

    /**
     * discriminator value for OrderEditResourceIdentifier
     */
    String ORDER_EDIT = "order-edit";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEdit" rel="nofollow">OrderEdit</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of OrderEditResourceIdentifier
     */
    public static OrderEditResourceIdentifier of() {
        return new OrderEditResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditResourceIdentifier of(final OrderEditResourceIdentifier template) {
        OrderEditResourceIdentifierImpl instance = new OrderEditResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public OrderEditResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of OrderEditResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditResourceIdentifier deepCopy(@Nullable final OrderEditResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        OrderEditResourceIdentifierImpl instance = new OrderEditResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for OrderEditResourceIdentifier
     * @return builder
     */
    public static OrderEditResourceIdentifierBuilder builder() {
        return OrderEditResourceIdentifierBuilder.of();
    }

    /**
     * create builder for OrderEditResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditResourceIdentifierBuilder builder(final OrderEditResourceIdentifier template) {
        return OrderEditResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditResourceIdentifier(Function<OrderEditResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditResourceIdentifier>";
            }
        };
    }
}
