
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
 * StagedOrderSetReturnItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnItemCustomTypeAction stagedOrderSetReturnItemCustomTypeAction = StagedOrderSetReturnItemCustomTypeAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnItemCustomTypeActionImpl.class)
public interface StagedOrderSetReturnItemCustomTypeAction extends StagedOrderUpdateAction {

    String SET_RETURN_ITEM_CUSTOM_TYPE = "setReturnItemCustomType";

    /**
     *
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p>Defines the Type that extends the ReturnItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ReturnItem.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ReturnItem.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setReturnItemId(final String returnItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetReturnItemCustomTypeAction of() {
        return new StagedOrderSetReturnItemCustomTypeActionImpl();
    }

    public static StagedOrderSetReturnItemCustomTypeAction of(final StagedOrderSetReturnItemCustomTypeAction template) {
        StagedOrderSetReturnItemCustomTypeActionImpl instance = new StagedOrderSetReturnItemCustomTypeActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetReturnItemCustomTypeActionBuilder builder() {
        return StagedOrderSetReturnItemCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetReturnItemCustomTypeActionBuilder builder(
            final StagedOrderSetReturnItemCustomTypeAction template) {
        return StagedOrderSetReturnItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetReturnItemCustomTypeAction(
            Function<StagedOrderSetReturnItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnItemCustomTypeAction>";
            }
        };
    }
}
