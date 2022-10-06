
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
 *  <p>Changes the Associates of a Business Unit, generates a BusinessUnitAssociatesSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetAssociatesAction businessUnitSetAssociatesAction = BusinessUnitSetAssociatesAction.builder()
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetAssociatesActionImpl.class)
public interface BusinessUnitSetAssociatesAction extends BusinessUnitUpdateAction {

    String SET_ASSOCIATES = "setAssociates";

    /**
     *  <p>The new list of Associates. If not provided, any existing list is removed.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("associates")
    public List<AssociateDraft> getAssociates();

    @JsonIgnore
    public void setAssociates(final AssociateDraft... associates);

    public void setAssociates(final List<AssociateDraft> associates);

    public static BusinessUnitSetAssociatesAction of() {
        return new BusinessUnitSetAssociatesActionImpl();
    }

    public static BusinessUnitSetAssociatesAction of(final BusinessUnitSetAssociatesAction template) {
        BusinessUnitSetAssociatesActionImpl instance = new BusinessUnitSetAssociatesActionImpl();
        instance.setAssociates(template.getAssociates());
        return instance;
    }

    public static BusinessUnitSetAssociatesActionBuilder builder() {
        return BusinessUnitSetAssociatesActionBuilder.of();
    }

    public static BusinessUnitSetAssociatesActionBuilder builder(final BusinessUnitSetAssociatesAction template) {
        return BusinessUnitSetAssociatesActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetAssociatesAction(Function<BusinessUnitSetAssociatesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAssociatesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetAssociatesAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetAssociatesAction>";
            }
        };
    }
}
