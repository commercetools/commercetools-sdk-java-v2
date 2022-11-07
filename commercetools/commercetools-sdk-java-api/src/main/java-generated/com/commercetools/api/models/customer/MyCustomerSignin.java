
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSignin
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSignin myCustomerSignin = MyCustomerSignin.builder()
 *             .email("{email}")
 *             .password("{password}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSigninImpl.class)
public interface MyCustomerSignin {

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Password of the Customer.</p>
     */
    @NotNull
    @JsonProperty("password")
    public String getPassword();

    /**
     *  <ul>
     *   <li>If <code>MergeWithExistingCustomerCart</code>, LineItems of the anonymous Cart are merged with the recently modified active Customer Cart.</li>
     *   <li>If <code>UseAsNewActiveCustomerCart</code>, the anonymous Cart is used as the new active Customer Cart, and no LineItems are merged.</li>
     *  </ul>
     */

    @JsonProperty("activeCartSignInMode")
    public AnonymousCartSignInMode getActiveCartSignInMode();

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart is updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates are updated.</li>
     *  </ul>
     */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    public void setEmail(final String email);

    public void setPassword(final String password);

    public void setActiveCartSignInMode(final AnonymousCartSignInMode activeCartSignInMode);

    public void setUpdateProductData(final Boolean updateProductData);

    public static MyCustomerSignin of() {
        return new MyCustomerSigninImpl();
    }

    public static MyCustomerSignin of(final MyCustomerSignin template) {
        MyCustomerSigninImpl instance = new MyCustomerSigninImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setActiveCartSignInMode(template.getActiveCartSignInMode());
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public static MyCustomerSigninBuilder builder() {
        return MyCustomerSigninBuilder.of();
    }

    public static MyCustomerSigninBuilder builder(final MyCustomerSignin template) {
        return MyCustomerSigninBuilder.of(template);
    }

    default <T> T withMyCustomerSignin(Function<MyCustomerSignin, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSignin> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSignin>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSignin>";
            }
        };
    }
}
