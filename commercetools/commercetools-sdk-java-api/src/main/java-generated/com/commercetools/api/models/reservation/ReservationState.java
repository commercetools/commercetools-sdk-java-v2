
package com.commercetools.api.models.reservation;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Status of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReservationState extends JsonEnum {

    /**
    <p>The <code>availableQuantity</code> of the item has been reduced by the reserved quantity, but the <code>quantityOnStock</code> remains unchanged.</p> */
    ReservationState CREATED = ReservationStateEnum.CREATED;
    /**
    <p>The reservation has been updated. If the quantity of an item changed, the <code>availableQuantity</code> is increased or decreased accordingly, while the <code>quantityOnStock</code> remains unchanged.</p> */
    ReservationState UPDATED = ReservationStateEnum.UPDATED;
    /**
    <p>The reserved quantity of the item has been released. The <code>availableQuantity</code> is increased accordingly.</p> */
    ReservationState RELEASED = ReservationStateEnum.RELEASED;
    /**
    <p>The reservation has expired and the <code>availableQuantity</code> is increased accordingly. Reservation expirations are <span>eventually consistent</span>, meaning it can take a few minutes for the status to update after expiration.</p> */
    ReservationState EXPIRED = ReservationStateEnum.EXPIRED;
    /**
    <p>The quantity of the item has been allocated for fulfillment. The <code>quantityOnStock</code> has been reduced by the reserved quantity.</p> */
    ReservationState COMMITTED = ReservationStateEnum.COMMITTED;

    /**
     * possible values of ReservationState
     */
    enum ReservationStateEnum implements ReservationState {
        /**
         * Created
         */
        CREATED("Created"),

        /**
         * Updated
         */
        UPDATED("Updated"),

        /**
         * Released
         */
        RELEASED("Released"),

        /**
         * Expired
         */
        EXPIRED("Expired"),

        /**
         * Committed
         */
        COMMITTED("Committed");
        private final String jsonName;

        private ReservationStateEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of ReservationState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ReservationState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReservationState() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ReservationState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ReservationState[] values() {
        return ReservationStateEnum.values();
    }

}
