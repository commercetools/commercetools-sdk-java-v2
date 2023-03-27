
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Associate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Associate associate = Associate.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateImpl.class)
public interface Associate {

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<AssociateRole> getRoles();

    /**
     *  <p>The Customer that is part of the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final AssociateRole... roles);

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<AssociateRole> roles);

    /**
     *  <p>The Customer that is part of the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     * factory method
     * @return instance of Associate
     */
    public static Associate of() {
        return new AssociateImpl();
    }

    /**
     * factory method to copy an instance of Associate
     * @param template instance to be copied
     * @return copy instance
     */
    public static Associate of(final Associate template) {
        AssociateImpl instance = new AssociateImpl();
        instance.setRoles(template.getRoles());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * builder factory method for Associate
     * @return builder
     */
    public static AssociateBuilder builder() {
        return AssociateBuilder.of();
    }

    /**
     * create builder for Associate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateBuilder builder(final Associate template) {
        return AssociateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociate(Function<Associate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Associate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Associate>() {
            @Override
            public String toString() {
                return "TypeReference<Associate>";
            }
        };
    }
}
