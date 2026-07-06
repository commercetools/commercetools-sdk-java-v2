
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Inventory configuration settings for a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryConfiguration inventoryConfiguration = InventoryConfiguration.builder()
 *             .releaseExpiredReservations(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryConfigurationImpl.class)
public interface InventoryConfiguration {

    /**
     *  <p>The number of minutes after which a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a> expires. To use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode, this field must be set.</p>
     * @return reservationExpirationInMinutes
     */

    @JsonProperty("reservationExpirationInMinutes")
    public Integer getReservationExpirationInMinutes();

    /**
     *  <p>If set to <code>true</code>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservations</a> are marked as <code>Expired</code> once their <code>reservationExpirationInMinutes</code> is reached. The reserved inventory is then made available. If set to <code>false</code>, tracking Line Items with expired reservations becomes your responsibility.</p>
     * @return releaseExpiredReservations
     */
    @NotNull
    @JsonProperty("releaseExpiredReservations")
    public Boolean getReleaseExpiredReservations();

    /**
     *  <p>The number of minutes after which a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a> expires. To use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode, this field must be set.</p>
     * @param reservationExpirationInMinutes value to be set
     */

    public void setReservationExpirationInMinutes(final Integer reservationExpirationInMinutes);

    /**
     *  <p>If set to <code>true</code>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservations</a> are marked as <code>Expired</code> once their <code>reservationExpirationInMinutes</code> is reached. The reserved inventory is then made available. If set to <code>false</code>, tracking Line Items with expired reservations becomes your responsibility.</p>
     * @param releaseExpiredReservations value to be set
     */

    public void setReleaseExpiredReservations(final Boolean releaseExpiredReservations);

    /**
     * factory method
     * @return instance of InventoryConfiguration
     */
    public static InventoryConfiguration of() {
        return new InventoryConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy InventoryConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryConfiguration of(final InventoryConfiguration template) {
        InventoryConfigurationImpl instance = new InventoryConfigurationImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        instance.setReleaseExpiredReservations(template.getReleaseExpiredReservations());
        return instance;
    }

    public InventoryConfiguration copyDeep();

    /**
     * factory method to create a deep copy of InventoryConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryConfiguration deepCopy(@Nullable final InventoryConfiguration template) {
        if (template == null) {
            return null;
        }
        InventoryConfigurationImpl instance = new InventoryConfigurationImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        instance.setReleaseExpiredReservations(template.getReleaseExpiredReservations());
        return instance;
    }

    /**
     * builder factory method for InventoryConfiguration
     * @return builder
     */
    public static InventoryConfigurationBuilder builder() {
        return InventoryConfigurationBuilder.of();
    }

    /**
     * create builder for InventoryConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryConfigurationBuilder builder(final InventoryConfiguration template) {
        return InventoryConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryConfiguration(Function<InventoryConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<InventoryConfiguration> typeReference() {
        return new tools.jackson.core.type.TypeReference<InventoryConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryConfiguration>";
            }
        };
    }
}
