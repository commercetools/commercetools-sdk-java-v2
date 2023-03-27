
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If <code>storeMode</code> is changed to <code>FromParent</code>, current Stores defined for the Business Unit are removed. Only Business Units of type <code>Division</code> can be set to <code>FromParent</code>. This update action generates a BusinessUnitStoreModeChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetStoreModeAction businessUnitSetStoreModeAction = BusinessUnitSetStoreModeAction.builder()
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetStoreModeActionImpl.class)
public interface BusinessUnitSetStoreModeAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetStoreModeAction
     */
    String SET_STORE_MODE = "setStoreMode";

    /**
     *  <p>Set to <code>Explicit</code> to specify Stores for the Business Unit. Set to <code>FromParent</code> to inherit Stores from a parent.</p>
     * @return storeMode
     */
    @NotNull
    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>Set to <code>Explicit</code> to specify Stores for the Business Unit. Set to <code>FromParent</code> to inherit Stores from a parent.</p>
     * @param storeMode value to be set
     */

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>Set the Stores the Business Unit is associated with. Can only be set if <code>storeMode</code> is <code>Explicit</code>.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of BusinessUnitSetStoreModeAction
     */
    public static BusinessUnitSetStoreModeAction of() {
        return new BusinessUnitSetStoreModeActionImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitSetStoreModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetStoreModeAction of(final BusinessUnitSetStoreModeAction template) {
        BusinessUnitSetStoreModeActionImpl instance = new BusinessUnitSetStoreModeActionImpl();
        instance.setStoreMode(template.getStoreMode());
        instance.setStores(template.getStores());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetStoreModeAction
     * @return builder
     */
    public static BusinessUnitSetStoreModeActionBuilder builder() {
        return BusinessUnitSetStoreModeActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetStoreModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetStoreModeActionBuilder builder(final BusinessUnitSetStoreModeAction template) {
        return BusinessUnitSetStoreModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetStoreModeAction(Function<BusinessUnitSetStoreModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetStoreModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetStoreModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetStoreModeAction>";
            }
        };
    }
}
