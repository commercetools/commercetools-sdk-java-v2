
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Updates the Business Unit on the Order. Setting the Order's <code>businessUnit</code> does not recalculate prices or discounts on the Order.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderBusinessUnitSetMessage" rel="nofollow">OrderBusinessUnitSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetBusinessUnitAction stagedOrderSetBusinessUnitAction = StagedOrderSetBusinessUnitAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setBusinessUnit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetBusinessUnitActionImpl.class)
public interface StagedOrderSetBusinessUnitAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetBusinessUnitAction
     */
    String SET_BUSINESS_UNIT = "setBusinessUnit";

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     * factory method
     * @return instance of StagedOrderSetBusinessUnitAction
     */
    public static StagedOrderSetBusinessUnitAction of() {
        return new StagedOrderSetBusinessUnitActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetBusinessUnitAction of(final StagedOrderSetBusinessUnitAction template) {
        StagedOrderSetBusinessUnitActionImpl instance = new StagedOrderSetBusinessUnitActionImpl();
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public StagedOrderSetBusinessUnitAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetBusinessUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetBusinessUnitAction deepCopy(@Nullable final StagedOrderSetBusinessUnitAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetBusinessUnitActionImpl instance = new StagedOrderSetBusinessUnitActionImpl();
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetBusinessUnitAction
     * @return builder
     */
    public static StagedOrderSetBusinessUnitActionBuilder builder() {
        return StagedOrderSetBusinessUnitActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetBusinessUnitActionBuilder builder(final StagedOrderSetBusinessUnitAction template) {
        return StagedOrderSetBusinessUnitActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetBusinessUnitAction(Function<StagedOrderSetBusinessUnitAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBusinessUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBusinessUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetBusinessUnitAction>";
            }
        };
    }
}
