
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Number of days after which a Cart with <code>Active</code> CartState is deleted since its last modification.</p>
 *  <p>If a ChangeSubscription exists for Carts, a ResourceDeletedDeliveryPayload is sent.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetDeleteDaysAfterLastModificationAction myCartSetDeleteDaysAfterLastModificationAction = MyCartSetDeleteDaysAfterLastModificationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface MyCartSetDeleteDaysAfterLastModificationAction extends MyCartUpdateAction {

    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = "setDeleteDaysAfterLastModification";

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in Project settings is assigned.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    public static MyCartSetDeleteDaysAfterLastModificationAction of() {
        return new MyCartSetDeleteDaysAfterLastModificationActionImpl();
    }

    public static MyCartSetDeleteDaysAfterLastModificationAction of(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        MyCartSetDeleteDaysAfterLastModificationActionImpl instance = new MyCartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return MyCartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static MyCartSetDeleteDaysAfterLastModificationActionBuilder builder(
            final MyCartSetDeleteDaysAfterLastModificationAction template) {
        return MyCartSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    default <T> T withMyCartSetDeleteDaysAfterLastModificationAction(
            Function<MyCartSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetDeleteDaysAfterLastModificationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetDeleteDaysAfterLastModificationAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetDeleteDaysAfterLastModificationAction>";
            }
        };
    }
}
