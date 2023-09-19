
package com.commercetools.api.models.associate_role;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Permissions grant granular access to Approval Rules, Approval Flows, Business Units, Carts, Orders, Quotes, and Quote Requests.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Permission extends JsonEnum {

    /**
    	<p>An Associate can create a child Business Unit.</p>

    */
    Permission ADD_CHILD_UNITS = PermissionEnum.ADD_CHILD_UNITS;
    /**
    	<p>An Associate can manage other Associates.</p>

    */
    Permission UPDATE_ASSOCIATES = PermissionEnum.UPDATE_ASSOCIATES;
    /**
    	<p>An Associate can edit Business Unit details.</p>

    */
    Permission UPDATE_BUSINESS_UNIT_DETAILS = PermissionEnum.UPDATE_BUSINESS_UNIT_DETAILS;
    /**
    	<p>An Associate can assign a Business Unit to be the parent unit. Additionally, the Associate requires the <code>AddChildUnits</code> permission in the new parent to perform the assignment.</p>

    */
    Permission UPDATE_PARENT_UNIT = PermissionEnum.UPDATE_PARENT_UNIT;
    /**
    	<p>An Associate can view their own B2B Carts.</p>

    */
    Permission VIEW_MY_CARTS = PermissionEnum.VIEW_MY_CARTS;
    /**
    	<p>An Associate can view B2B Carts that belong to other Associates.</p>

    */
    Permission VIEW_OTHERS_CARTS = PermissionEnum.VIEW_OTHERS_CARTS;
    /**
    	<p>An Associate can update their own B2B Carts.</p>

    */
    Permission UPDATE_MY_CARTS = PermissionEnum.UPDATE_MY_CARTS;
    /**
    	<p>An Associate can update B2B Carts that belong to other Associates.</p>

    */
    Permission UPDATE_OTHERS_CARTS = PermissionEnum.UPDATE_OTHERS_CARTS;
    /**
    	<p>An Associate can create their own B2B Carts.</p>

    */
    Permission CREATE_MY_CARTS = PermissionEnum.CREATE_MY_CARTS;
    /**
    	<p>An Associate can create B2B Carts that belong to other Associates.</p>

    */
    Permission CREATE_OTHERS_CARTS = PermissionEnum.CREATE_OTHERS_CARTS;
    /**
    	<p>An Associate can delete their own B2B Carts.</p>

    */
    Permission DELETE_MY_CARTS = PermissionEnum.DELETE_MY_CARTS;
    /**
    	<p>An Associate can delete B2B Carts that belong to other Associates.</p>

    */
    Permission DELETE_OTHERS_CARTS = PermissionEnum.DELETE_OTHERS_CARTS;
    /**
    	<p>An Associate can view their own B2B Orders.</p>

    */
    Permission VIEW_MY_ORDERS = PermissionEnum.VIEW_MY_ORDERS;
    /**
    	<p>An Associate can view B2B Orders that belong to other Associates.</p>

    */
    Permission VIEW_OTHERS_ORDERS = PermissionEnum.VIEW_OTHERS_ORDERS;
    /**
    	<p>An Associate can update their own B2B Orders.</p>

    */
    Permission UPDATE_MY_ORDERS = PermissionEnum.UPDATE_MY_ORDERS;
    /**
    	<p>An Associate can update B2B Orders that belong to other Associates.</p>

    */
    Permission UPDATE_OTHERS_ORDERS = PermissionEnum.UPDATE_OTHERS_ORDERS;
    /**
    	<p>An Associate can create Orders from their own B2B Carts.</p>

    */
    Permission CREATE_MY_ORDERS_FROM_MY_CARTS = PermissionEnum.CREATE_MY_ORDERS_FROM_MY_CARTS;
    /**
    	<p>An Associate can create Orders from their own B2B Quotes.</p>

    */
    Permission CREATE_MY_ORDERS_FROM_MY_QUOTES = PermissionEnum.CREATE_MY_ORDERS_FROM_MY_QUOTES;
    /**
    	<p>An Associate can create Orders from B2B Carts that belong to other Associates.</p>

    */
    Permission CREATE_ORDERS_FROM_OTHERS_CARTS = PermissionEnum.CREATE_ORDERS_FROM_OTHERS_CARTS;
    /**
    	<p>An Associate can create Orders from B2B Quotes that belong to other Associates.</p>

    */
    Permission CREATE_ORDERS_FROM_OTHERS_QUOTES = PermissionEnum.CREATE_ORDERS_FROM_OTHERS_QUOTES;
    /**
    	<p>An Associate can view their own B2B Quotes.</p>

    */
    Permission VIEW_MY_QUOTES = PermissionEnum.VIEW_MY_QUOTES;
    /**
    	<p>An Associate can view B2B Quotes that belong to other Associates.</p>

    */
    Permission VIEW_OTHERS_QUOTES = PermissionEnum.VIEW_OTHERS_QUOTES;
    /**
    	<p>An Associate can accept their own B2B Quotes.</p>

    */
    Permission ACCEPT_MY_QUOTES = PermissionEnum.ACCEPT_MY_QUOTES;
    /**
    	<p>An Associate can accept B2B Quotes that belong to other Associates.</p>

    */
    Permission ACCEPT_OTHERS_QUOTES = PermissionEnum.ACCEPT_OTHERS_QUOTES;
    /**
    	<p>An Associate can decline their own B2B Quotes.</p>

    */
    Permission DECLINE_MY_QUOTES = PermissionEnum.DECLINE_MY_QUOTES;
    /**
    	<p>An Associate can decline B2B Quotes that belong to other Associates.</p>

    */
    Permission DECLINE_OTHERS_QUOTES = PermissionEnum.DECLINE_OTHERS_QUOTES;
    /**
    	<p>An Associate can renegotiate their own B2B Quotes.</p>

    */
    Permission RENEGOTIATE_MY_QUOTES = PermissionEnum.RENEGOTIATE_MY_QUOTES;
    /**
    	<p>An Associate can renegotiate B2B Quotes that belong to other Associates.</p>

    */
    Permission RENEGOTIATE_OTHERS_QUOTES = PermissionEnum.RENEGOTIATE_OTHERS_QUOTES;
    /**
    	<p>An Associate can reassign their own B2B Quotes to a different Associate.</p>

    */
    Permission REASSIGN_MY_QUOTES = PermissionEnum.REASSIGN_MY_QUOTES;
    /**
    	<p>An Associate can reassign B2B Quotes that belong to other Associates.</p>

    */
    Permission REASSIGN_OTHERS_QUOTES = PermissionEnum.REASSIGN_OTHERS_QUOTES;
    /**
    	<p>An Associate can view their own B2B Quote Requests.</p>

    */
    Permission VIEW_MY_QUOTE_REQUESTS = PermissionEnum.VIEW_MY_QUOTE_REQUESTS;
    /**
    	<p>An Associate can view B2B Quote Requests that belong to other Associates.</p>

    */
    Permission VIEW_OTHERS_QUOTE_REQUESTS = PermissionEnum.VIEW_OTHERS_QUOTE_REQUESTS;
    /**
    	<p>An Associate can update their own B2B Quote Requests.</p>

    */
    Permission UPDATE_MY_QUOTE_REQUESTS = PermissionEnum.UPDATE_MY_QUOTE_REQUESTS;
    /**
    	<p>An Associate can update B2B Quote Requests of other Associates.</p>

    */
    Permission UPDATE_OTHERS_QUOTE_REQUESTS = PermissionEnum.UPDATE_OTHERS_QUOTE_REQUESTS;
    /**
    	<p>An Associate can create their own Quote Requests from their own B2B Carts.</p>

    */
    Permission CREATE_MY_QUOTE_REQUESTS_FROM_MY_CARTS = PermissionEnum.CREATE_MY_QUOTE_REQUESTS_FROM_MY_CARTS;
    /**
    	<p>An Associate can create Quote Requests from B2B Carts that belong to other Associates.</p>

    */
    Permission CREATE_QUOTE_REQUESTS_FROM_OTHERS_CARTS = PermissionEnum.CREATE_QUOTE_REQUESTS_FROM_OTHERS_CARTS;
    /**
    	<p>An Associate can create Approval Rules.</p>

    */
    Permission CREATE_APPROVAL_RULES = PermissionEnum.CREATE_APPROVAL_RULES;
    /**
    	<p>An Associate can update Approval Rules.</p>

    */
    Permission UPDATE_APPROVAL_RULES = PermissionEnum.UPDATE_APPROVAL_RULES;
    /**
    	<p>An Associate can update Approval Flows.</p>

    */
    Permission UPDATE_APPROVAL_FLOWS = PermissionEnum.UPDATE_APPROVAL_FLOWS;

    /**
     * possible values of Permission
     */
    enum PermissionEnum implements Permission {
        /**
         * AddChildUnits
         */
        ADD_CHILD_UNITS("AddChildUnits"),

        /**
         * UpdateAssociates
         */
        UPDATE_ASSOCIATES("UpdateAssociates"),

        /**
         * UpdateBusinessUnitDetails
         */
        UPDATE_BUSINESS_UNIT_DETAILS("UpdateBusinessUnitDetails"),

        /**
         * UpdateParentUnit
         */
        UPDATE_PARENT_UNIT("UpdateParentUnit"),

        /**
         * ViewMyCarts
         */
        VIEW_MY_CARTS("ViewMyCarts"),

        /**
         * ViewOthersCarts
         */
        VIEW_OTHERS_CARTS("ViewOthersCarts"),

        /**
         * UpdateMyCarts
         */
        UPDATE_MY_CARTS("UpdateMyCarts"),

        /**
         * UpdateOthersCarts
         */
        UPDATE_OTHERS_CARTS("UpdateOthersCarts"),

        /**
         * CreateMyCarts
         */
        CREATE_MY_CARTS("CreateMyCarts"),

        /**
         * CreateOthersCarts
         */
        CREATE_OTHERS_CARTS("CreateOthersCarts"),

        /**
         * DeleteMyCarts
         */
        DELETE_MY_CARTS("DeleteMyCarts"),

        /**
         * DeleteOthersCarts
         */
        DELETE_OTHERS_CARTS("DeleteOthersCarts"),

        /**
         * ViewMyOrders
         */
        VIEW_MY_ORDERS("ViewMyOrders"),

        /**
         * ViewOthersOrders
         */
        VIEW_OTHERS_ORDERS("ViewOthersOrders"),

        /**
         * UpdateMyOrders
         */
        UPDATE_MY_ORDERS("UpdateMyOrders"),

        /**
         * UpdateOthersOrders
         */
        UPDATE_OTHERS_ORDERS("UpdateOthersOrders"),

        /**
         * CreateMyOrdersFromMyCarts
         */
        CREATE_MY_ORDERS_FROM_MY_CARTS("CreateMyOrdersFromMyCarts"),

        /**
         * CreateMyOrdersFromMyQuotes
         */
        CREATE_MY_ORDERS_FROM_MY_QUOTES("CreateMyOrdersFromMyQuotes"),

        /**
         * CreateOrdersFromOthersCarts
         */
        CREATE_ORDERS_FROM_OTHERS_CARTS("CreateOrdersFromOthersCarts"),

        /**
         * CreateOrdersFromOthersQuotes
         */
        CREATE_ORDERS_FROM_OTHERS_QUOTES("CreateOrdersFromOthersQuotes"),

        /**
         * ViewMyQuotes
         */
        VIEW_MY_QUOTES("ViewMyQuotes"),

        /**
         * ViewOthersQuotes
         */
        VIEW_OTHERS_QUOTES("ViewOthersQuotes"),

        /**
         * AcceptMyQuotes
         */
        ACCEPT_MY_QUOTES("AcceptMyQuotes"),

        /**
         * AcceptOthersQuotes
         */
        ACCEPT_OTHERS_QUOTES("AcceptOthersQuotes"),

        /**
         * DeclineMyQuotes
         */
        DECLINE_MY_QUOTES("DeclineMyQuotes"),

        /**
         * DeclineOthersQuotes
         */
        DECLINE_OTHERS_QUOTES("DeclineOthersQuotes"),

        /**
         * RenegotiateMyQuotes
         */
        RENEGOTIATE_MY_QUOTES("RenegotiateMyQuotes"),

        /**
         * RenegotiateOthersQuotes
         */
        RENEGOTIATE_OTHERS_QUOTES("RenegotiateOthersQuotes"),

        /**
         * ReassignMyQuotes
         */
        REASSIGN_MY_QUOTES("ReassignMyQuotes"),

        /**
         * ReassignOthersQuotes
         */
        REASSIGN_OTHERS_QUOTES("ReassignOthersQuotes"),

        /**
         * ViewMyQuoteRequests
         */
        VIEW_MY_QUOTE_REQUESTS("ViewMyQuoteRequests"),

        /**
         * ViewOthersQuoteRequests
         */
        VIEW_OTHERS_QUOTE_REQUESTS("ViewOthersQuoteRequests"),

        /**
         * UpdateMyQuoteRequests
         */
        UPDATE_MY_QUOTE_REQUESTS("UpdateMyQuoteRequests"),

        /**
         * UpdateOthersQuoteRequests
         */
        UPDATE_OTHERS_QUOTE_REQUESTS("UpdateOthersQuoteRequests"),

        /**
         * CreateMyQuoteRequestsFromMyCarts
         */
        CREATE_MY_QUOTE_REQUESTS_FROM_MY_CARTS("CreateMyQuoteRequestsFromMyCarts"),

        /**
         * CreateQuoteRequestsFromOthersCarts
         */
        CREATE_QUOTE_REQUESTS_FROM_OTHERS_CARTS("CreateQuoteRequestsFromOthersCarts"),

        /**
         * CreateApprovalRules
         */
        CREATE_APPROVAL_RULES("CreateApprovalRules"),

        /**
         * UpdateApprovalRules
         */
        UPDATE_APPROVAL_RULES("UpdateApprovalRules"),

        /**
         * UpdateApprovalFlows
         */
        UPDATE_APPROVAL_FLOWS("UpdateApprovalFlows");
        private final String jsonName;

        private PermissionEnum(final String jsonName) {
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
     * factory method for a enum value of Permission
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static Permission findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new Permission() {
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
    public static Optional<Permission> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static Permission[] values() {
        return PermissionEnum.values();
    }

}
