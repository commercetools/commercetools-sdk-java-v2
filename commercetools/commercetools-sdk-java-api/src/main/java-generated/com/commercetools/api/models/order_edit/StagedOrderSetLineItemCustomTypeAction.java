
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * StagedOrderSetLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemCustomTypeAction stagedOrderSetLineItemCustomTypeAction = StagedOrderSetLineItemCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLineItemCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemCustomTypeActionImpl.class)
public interface StagedOrderSetLineItemCustomTypeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLineItemCustomTypeAction
     */
    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Defines the Type that extends the Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Defines the Type that extends the Line Item with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Line Item.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Line Item.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StagedOrderSetLineItemCustomTypeAction
     */
    public static StagedOrderSetLineItemCustomTypeAction of() {
        return new StagedOrderSetLineItemCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLineItemCustomTypeAction of(final StagedOrderSetLineItemCustomTypeAction template) {
        StagedOrderSetLineItemCustomTypeActionImpl instance = new StagedOrderSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public StagedOrderSetLineItemCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetLineItemCustomTypeAction deepCopy(
            @Nullable final StagedOrderSetLineItemCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetLineItemCustomTypeActionImpl instance = new StagedOrderSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLineItemCustomTypeAction
     * @return builder
     */
    public static StagedOrderSetLineItemCustomTypeActionBuilder builder() {
        return StagedOrderSetLineItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemCustomTypeActionBuilder builder(
            final StagedOrderSetLineItemCustomTypeAction template) {
        return StagedOrderSetLineItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLineItemCustomTypeAction(
            Function<StagedOrderSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemCustomTypeAction>";
            }
        };
    }
}
