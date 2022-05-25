
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomTypeAction stagedOrderSetCustomTypeAction = StagedOrderSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomTypeActionImpl.class)
public interface StagedOrderSetCustomTypeAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the StagedOrder with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StagedOrder.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the StagedOrder.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static StagedOrderSetCustomTypeAction of() {
        return new StagedOrderSetCustomTypeActionImpl();
    }

    public static StagedOrderSetCustomTypeAction of(final StagedOrderSetCustomTypeAction template) {
        StagedOrderSetCustomTypeActionImpl instance = new StagedOrderSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static StagedOrderSetCustomTypeActionBuilder builder() {
        return StagedOrderSetCustomTypeActionBuilder.of();
    }

    public static StagedOrderSetCustomTypeActionBuilder builder(final StagedOrderSetCustomTypeAction template) {
        return StagedOrderSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomTypeAction(Function<StagedOrderSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomTypeAction>";
            }
        };
    }
}
