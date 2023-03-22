
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
 *  <p>Adding a Store to a Business Unit generates a BusinessUnitStoreAdded Message. Only applicable when <code>storeMode</code> is <code>Explicit</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddStoreAction businessUnitAddStoreAction = BusinessUnitAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddStoreActionImpl.class)
public interface BusinessUnitAddStoreAction extends BusinessUnitUpdateAction {

    String ADD_STORE = "addStore";

    /**
     *  <p>Store to add.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static BusinessUnitAddStoreAction of() {
        return new BusinessUnitAddStoreActionImpl();
    }

    public static BusinessUnitAddStoreAction of(final BusinessUnitAddStoreAction template) {
        BusinessUnitAddStoreActionImpl instance = new BusinessUnitAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static BusinessUnitAddStoreActionBuilder builder() {
        return BusinessUnitAddStoreActionBuilder.of();
    }

    public static BusinessUnitAddStoreActionBuilder builder(final BusinessUnitAddStoreAction template) {
        return BusinessUnitAddStoreActionBuilder.of(template);
    }

    default <T> T withBusinessUnitAddStoreAction(Function<BusinessUnitAddStoreAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddStoreAction>";
            }
        };
    }
}
