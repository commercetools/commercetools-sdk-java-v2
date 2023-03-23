
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the title of the Customer produces the CustomerTitleSetMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetTitleAction customerSetTitleAction = CustomerSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetTitleActionImpl.class)
public interface CustomerSetTitleAction extends CustomerUpdateAction {

    String SET_TITLE = "setTitle";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    public void setTitle(final String title);

    public static CustomerSetTitleAction of() {
        return new CustomerSetTitleActionImpl();
    }

    public static CustomerSetTitleAction of(final CustomerSetTitleAction template) {
        CustomerSetTitleActionImpl instance = new CustomerSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    public static CustomerSetTitleActionBuilder builder() {
        return CustomerSetTitleActionBuilder.of();
    }

    public static CustomerSetTitleActionBuilder builder(final CustomerSetTitleAction template) {
        return CustomerSetTitleActionBuilder.of(template);
    }

    default <T> T withCustomerSetTitleAction(Function<CustomerSetTitleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetTitleAction>";
            }
        };
    }
}
