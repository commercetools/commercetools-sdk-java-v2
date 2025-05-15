
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Password of the Customer.</p>
     * @return password
     */
    @NotNull
    @JsonProperty("password")
    public String getPassword();

    /**
     *  <ul>
     *   <li>If <code>MergeWithExistingCustomerCart</code>, LineItems of the anonymous Cart are merged with the recently modified active Customer Cart.</li>
     *   <li>If <code>UseAsNewActiveCustomerCart</code>, the anonymous Cart is used as the new active Customer Cart, and no LineItems are merged.</li>
     *  </ul>
     * @return activeCartSignInMode
     */

    @JsonProperty("activeCartSignInMode")
    public AnonymousCartSignInMode getActiveCartSignInMode();

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart is updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates are updated.</li>
     *  </ul>
     * @return updateProductData
     */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    /**
     *  <p>Email address of the Customer treated as case-insensitive.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Password of the Customer.</p>
     * @param password value to be set
     */

    public void setPassword(final String password);

    /**
     *  <ul>
     *   <li>If <code>MergeWithExistingCustomerCart</code>, LineItems of the anonymous Cart are merged with the recently modified active Customer Cart.</li>
     *   <li>If <code>UseAsNewActiveCustomerCart</code>, the anonymous Cart is used as the new active Customer Cart, and no LineItems are merged.</li>
     *  </ul>
     * @param activeCartSignInMode value to be set
     */

    public void setActiveCartSignInMode(final AnonymousCartSignInMode activeCartSignInMode);

    /**
     *  <ul>
     *   <li>If <code>true</code>, the LineItem Product data (<code>name</code>, <code>variant</code>, and <code>productType</code>) of the returned Cart is updated.</li>
     *   <li>If <code>false</code>, only the prices, discounts, and tax rates are updated.</li>
     *  </ul>
     * @param updateProductData value to be set
     */

    public void setUpdateProductData(final Boolean updateProductData);

    /**
     * factory method
     * @return instance of MyCustomerSignin
     */
    public static MyCustomerSignin of() {
        return new MyCustomerSigninImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSignin
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSignin of(final MyCustomerSignin template) {
        MyCustomerSigninImpl instance = new MyCustomerSigninImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setActiveCartSignInMode(template.getActiveCartSignInMode());
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public MyCustomerSignin copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerSignin
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSignin deepCopy(@Nullable final MyCustomerSignin template) {
        if (template == null) {
            return null;
        }
        MyCustomerSigninImpl instance = new MyCustomerSigninImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setActiveCartSignInMode(template.getActiveCartSignInMode());
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSignin
     * @return builder
     */
    public static MyCustomerSigninBuilder builder() {
        return MyCustomerSigninBuilder.of();
    }

    /**
     * create builder for MyCustomerSignin instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSigninBuilder builder(final MyCustomerSignin template) {
        return MyCustomerSigninBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSignin(Function<MyCustomerSignin, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSignin> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSignin>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSignin>";
            }
        };
    }
}
