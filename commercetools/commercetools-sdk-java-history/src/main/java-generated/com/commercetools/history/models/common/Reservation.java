
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReservationImpl.class)
public interface Reservation {

    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    @NotNull
    @Valid
    @JsonProperty("owner")
    public Reference getOwner();

    @NotNull
    @JsonProperty("createdAt")
    public String getCreatedAt();

    @NotNull
    @JsonProperty("checkoutStartedAt")
    public String getCheckoutStartedAt();

    public void setQuantity(final Integer quantity);

    public void setOwner(final Reference owner);

    public void setCreatedAt(final String createdAt);

    public void setCheckoutStartedAt(final String checkoutStartedAt);

    public static Reservation of() {
        return new ReservationImpl();
    }

    public static Reservation of(final Reservation template) {
        ReservationImpl instance = new ReservationImpl();
        instance.setQuantity(template.getQuantity());
        instance.setOwner(template.getOwner());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCheckoutStartedAt(template.getCheckoutStartedAt());
        return instance;
    }

    public static ReservationBuilder builder() {
        return ReservationBuilder.of();
    }

    public static ReservationBuilder builder(final Reservation template) {
        return ReservationBuilder.of(template);
    }

    default <T> T withReservation(Function<Reservation, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Reservation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reservation>() {
            @Override
            public String toString() {
                return "TypeReference<Reservation>";
            }
        };
    }
}
