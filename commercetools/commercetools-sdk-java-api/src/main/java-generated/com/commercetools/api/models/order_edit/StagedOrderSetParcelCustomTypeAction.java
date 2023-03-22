
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetParcelCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelCustomTypeAction stagedOrderSetParcelCustomTypeAction = StagedOrderSetParcelCustomTypeAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelCustomTypeActionImpl.class)
public interface StagedOrderSetParcelCustomTypeAction extends StagedOrderUpdateAction {

    String SET_PARCEL_CUSTOM_TYPE = "setParcelCustomType";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>Defines the Type that extends the Parcel with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Parcel.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Parcel.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setParcelId(final String parcelId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetParcelCustomTypeAction of() {
        return new StagedOrderSetParcelCustomTypeActionImpl();
    }

    public static StagedOrderSetParcelCustomTypeAction of(final StagedOrderSetParcelCustomTypeAction template) {
        StagedOrderSetParcelCustomTypeActionImpl instance = new StagedOrderSetParcelCustomTypeActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetParcelCustomTypeActionBuilder builder() {
        return StagedOrderSetParcelCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetParcelCustomTypeActionBuilder builder(
            final StagedOrderSetParcelCustomTypeAction template) {
        return StagedOrderSetParcelCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetParcelCustomTypeAction(Function<StagedOrderSetParcelCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelCustomTypeAction>";
            }
        };
    }
}
