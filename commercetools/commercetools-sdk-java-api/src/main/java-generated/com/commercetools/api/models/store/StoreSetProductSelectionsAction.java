
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Instead of adding or removing Product Selections individually, you can also change all the Store's Product Selections in one go using this update action. The Store will only contain the Product Selections specified in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetProductSelectionsAction storeSetProductSelectionsAction = StoreSetProductSelectionsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetProductSelectionsActionImpl.class)
public interface StoreSetProductSelectionsAction extends StoreUpdateAction {

    String SET_PRODUCT_SELECTIONS = "setProductSelections";

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSettingDraft> getProductSelections();

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSettingDraft... productSelections);

    public void setProductSelections(final List<ProductSelectionSettingDraft> productSelections);

    public static StoreSetProductSelectionsAction of() {
        return new StoreSetProductSelectionsActionImpl();
    }

    public static StoreSetProductSelectionsAction of(final StoreSetProductSelectionsAction template) {
        StoreSetProductSelectionsActionImpl instance = new StoreSetProductSelectionsActionImpl();
        instance.setProductSelections(template.getProductSelections());
        return instance;
    }

    public static StoreSetProductSelectionsActionBuilder builder() {
        return StoreSetProductSelectionsActionBuilder.of();
    }

    public static StoreSetProductSelectionsActionBuilder builder(final StoreSetProductSelectionsAction template) {
        return StoreSetProductSelectionsActionBuilder.of(template);
    }

    default <T> T withStoreSetProductSelectionsAction(Function<StoreSetProductSelectionsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetProductSelectionsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetProductSelectionsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetProductSelectionsAction>";
            }
        };
    }
}
