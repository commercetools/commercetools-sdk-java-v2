
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StagedOrderSetParcelCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelCustomFieldAction stagedOrderSetParcelCustomFieldAction = StagedOrderSetParcelCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setParcelCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelCustomFieldActionImpl.class)
public interface StagedOrderSetParcelCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetParcelCustomFieldAction
     */
    String SET_PARCEL_CUSTOM_FIELD = "setParcelCustomField";

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @JsonProperty("parcelKey")
    public String getParcelKey();

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     */

    public void setParcelKey(final String parcelKey);

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of StagedOrderSetParcelCustomFieldAction
     */
    public static StagedOrderSetParcelCustomFieldAction of() {
        return new StagedOrderSetParcelCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetParcelCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetParcelCustomFieldAction of(final StagedOrderSetParcelCustomFieldAction template) {
        StagedOrderSetParcelCustomFieldActionImpl instance = new StagedOrderSetParcelCustomFieldActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public StagedOrderSetParcelCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetParcelCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetParcelCustomFieldAction deepCopy(
            @Nullable final StagedOrderSetParcelCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetParcelCustomFieldActionImpl instance = new StagedOrderSetParcelCustomFieldActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetParcelCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetParcelCustomFieldActionBuilder builder() {
        return StagedOrderSetParcelCustomFieldActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetParcelCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelCustomFieldActionBuilder builder(
            final StagedOrderSetParcelCustomFieldAction template) {
        return StagedOrderSetParcelCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetParcelCustomFieldAction(Function<StagedOrderSetParcelCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetParcelCustomFieldAction ofUnset(final String name, final String parcelId) {
        return StagedOrderSetParcelCustomFieldActionBuilder.of().name(name).parcelId(parcelId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelCustomFieldAction>";
            }
        };
    }
}
