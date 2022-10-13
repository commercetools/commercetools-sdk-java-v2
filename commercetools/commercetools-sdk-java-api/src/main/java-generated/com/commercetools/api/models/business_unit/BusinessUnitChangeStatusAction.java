
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the status of a Business Unit generates a BusinessUnitStatusChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeStatusAction businessUnitChangeStatusAction = BusinessUnitChangeStatusAction.builder()
 *             .status("{status}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeStatusActionImpl.class)
public interface BusinessUnitChangeStatusAction extends BusinessUnitUpdateAction {

    String CHANGE_STATUS = "changeStatus";

    /**
     *  <p>New status to set.</p>
     */
    @NotNull
    @JsonProperty("status")
    public String getStatus();

    public void setStatus(final String status);

    public static BusinessUnitChangeStatusAction of() {
        return new BusinessUnitChangeStatusActionImpl();
    }

    public static BusinessUnitChangeStatusAction of(final BusinessUnitChangeStatusAction template) {
        BusinessUnitChangeStatusActionImpl instance = new BusinessUnitChangeStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public static BusinessUnitChangeStatusActionBuilder builder() {
        return BusinessUnitChangeStatusActionBuilder.of();
    }

    public static BusinessUnitChangeStatusActionBuilder builder(final BusinessUnitChangeStatusAction template) {
        return BusinessUnitChangeStatusActionBuilder.of(template);
    }

    default <T> T withBusinessUnitChangeStatusAction(Function<BusinessUnitChangeStatusAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeStatusAction>";
            }
        };
    }
}
