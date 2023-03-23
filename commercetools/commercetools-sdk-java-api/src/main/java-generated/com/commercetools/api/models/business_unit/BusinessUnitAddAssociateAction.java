
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
 *  <p>Adding an Associate to a Business Unit generates a BusinessUnitAssociateAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddAssociateAction businessUnitAddAssociateAction = BusinessUnitAddAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddAssociateActionImpl.class)
public interface BusinessUnitAddAssociateAction extends BusinessUnitUpdateAction {

    String ADD_ASSOCIATE = "addAssociate";

    /**
     *  <p>The Associate to add.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public AssociateDraft getAssociate();

    public void setAssociate(final AssociateDraft associate);

    public static BusinessUnitAddAssociateAction of() {
        return new BusinessUnitAddAssociateActionImpl();
    }

    public static BusinessUnitAddAssociateAction of(final BusinessUnitAddAssociateAction template) {
        BusinessUnitAddAssociateActionImpl instance = new BusinessUnitAddAssociateActionImpl();
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public static BusinessUnitAddAssociateActionBuilder builder() {
        return BusinessUnitAddAssociateActionBuilder.of();
    }

    public static BusinessUnitAddAssociateActionBuilder builder(final BusinessUnitAddAssociateAction template) {
        return BusinessUnitAddAssociateActionBuilder.of(template);
    }

    default <T> T withBusinessUnitAddAssociateAction(Function<BusinessUnitAddAssociateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAssociateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAssociateAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddAssociateAction>";
            }
        };
    }
}
