
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateDraft associateDraft = AssociateDraft.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateDraftImpl.class)
public interface AssociateDraft extends io.vrap.rmf.base.client.Draft<AssociateDraft> {

    /**
     *  <p>Roles the Associate should hold within the Business Unit.</p>
     */
    @NotNull
    @JsonProperty("roles")
    public List<AssociateRole> getRoles();

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    @JsonIgnore
    public void setRoles(final AssociateRole... roles);

    public void setRoles(final List<AssociateRole> roles);

    public void setCustomer(final CustomerResourceIdentifier customer);

    public static AssociateDraft of() {
        return new AssociateDraftImpl();
    }

    public static AssociateDraft of(final AssociateDraft template) {
        AssociateDraftImpl instance = new AssociateDraftImpl();
        instance.setRoles(template.getRoles());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static AssociateDraftBuilder builder() {
        return AssociateDraftBuilder.of();
    }

    public static AssociateDraftBuilder builder(final AssociateDraft template) {
        return AssociateDraftBuilder.of(template);
    }

    default <T> T withAssociateDraft(Function<AssociateDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssociateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateDraft>";
            }
        };
    }
}
