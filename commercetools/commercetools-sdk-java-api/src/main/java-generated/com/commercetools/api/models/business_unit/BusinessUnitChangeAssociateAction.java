
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the Associate on a Business Unit generates the BusinessUnitAssociateChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAssociateAction businessUnitChangeAssociateAction = BusinessUnitChangeAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeAssociateActionImpl.class)
public interface BusinessUnitChangeAssociateAction extends BusinessUnitUpdateAction {

    String CHANGE_ASSOCIATE = "changeAssociate";

    /**
     *  <p>New version of an existing Associate.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public AssociateDraft getAssociate();

    public void setAssociate(final AssociateDraft associate);

    public static BusinessUnitChangeAssociateAction of() {
        return new BusinessUnitChangeAssociateActionImpl();
    }

    public static BusinessUnitChangeAssociateAction of(final BusinessUnitChangeAssociateAction template) {
        BusinessUnitChangeAssociateActionImpl instance = new BusinessUnitChangeAssociateActionImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public static BusinessUnitChangeAssociateActionBuilder builder() {
        return BusinessUnitChangeAssociateActionBuilder.of();
    }

    public static BusinessUnitChangeAssociateActionBuilder builder(final BusinessUnitChangeAssociateAction template) {
        return BusinessUnitChangeAssociateActionBuilder.of(template);
    }

    default <T> T withBusinessUnitChangeAssociateAction(Function<BusinessUnitChangeAssociateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeAssociateAction>";
            }
        };
    }
}
