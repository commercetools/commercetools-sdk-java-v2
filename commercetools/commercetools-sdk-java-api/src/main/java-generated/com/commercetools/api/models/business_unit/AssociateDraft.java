
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
     * @return roles
     */

    @JsonProperty("roles")
    public List<AssociateRole> getRoles();

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Roles the Associate should hold within the Business Unit.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final AssociateRole... roles);

    /**
     *  <p>Roles the Associate should hold within the Business Unit.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<AssociateRole> roles);

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

    /**
     * factory method
     * @return instance of AssociateDraft
     */
    public static AssociateDraft of() {
        return new AssociateDraftImpl();
    }

    /**
     * factory method to create a shallow copy AssociateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateDraft of(final AssociateDraft template) {
        AssociateDraftImpl instance = new AssociateDraftImpl();
        instance.setRoles(template.getRoles());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateDraft deepCopy(@Nullable final AssociateDraft template) {
        if (template == null) {
            return null;
        }
        AssociateDraftImpl instance = new AssociateDraftImpl();
        instance.setRoles(Optional.ofNullable(template.getRoles()).map(ArrayList::new).orElse(null));
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for AssociateDraft
     * @return builder
     */
    public static AssociateDraftBuilder builder() {
        return AssociateDraftBuilder.of();
    }

    /**
     * create builder for AssociateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateDraftBuilder builder(final AssociateDraft template) {
        return AssociateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateDraft(Function<AssociateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateDraft>";
            }
        };
    }
}
