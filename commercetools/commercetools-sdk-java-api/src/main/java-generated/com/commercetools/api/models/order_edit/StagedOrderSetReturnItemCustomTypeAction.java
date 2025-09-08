
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
 * StagedOrderSetReturnItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnItemCustomTypeAction stagedOrderSetReturnItemCustomTypeAction = StagedOrderSetReturnItemCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setReturnItemCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnItemCustomTypeActionImpl.class)
public interface StagedOrderSetReturnItemCustomTypeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetReturnItemCustomTypeAction
     */
    String SET_RETURN_ITEM_CUSTOM_TYPE = "setReturnItemCustomType";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @JsonProperty("returnItemKey")
    public String getReturnItemKey();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Return Item with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Return Item.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Return Item.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     */

    public void setReturnItemKey(final String returnItemKey);

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Return Item with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Return Item.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Return Item.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StagedOrderSetReturnItemCustomTypeAction
     */
    public static StagedOrderSetReturnItemCustomTypeAction of() {
        return new StagedOrderSetReturnItemCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetReturnItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetReturnItemCustomTypeAction of(final StagedOrderSetReturnItemCustomTypeAction template) {
        StagedOrderSetReturnItemCustomTypeActionImpl instance = new StagedOrderSetReturnItemCustomTypeActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public StagedOrderSetReturnItemCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetReturnItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetReturnItemCustomTypeAction deepCopy(
            @Nullable final StagedOrderSetReturnItemCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetReturnItemCustomTypeActionImpl instance = new StagedOrderSetReturnItemCustomTypeActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetReturnItemCustomTypeAction
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomTypeActionBuilder builder() {
        return StagedOrderSetReturnItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetReturnItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomTypeActionBuilder builder(
            final StagedOrderSetReturnItemCustomTypeAction template) {
        return StagedOrderSetReturnItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetReturnItemCustomTypeAction(
            Function<StagedOrderSetReturnItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnItemCustomTypeAction>";
            }
        };
    }
}
