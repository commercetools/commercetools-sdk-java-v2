
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Permissions grant granular access to <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rules</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flows</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Units</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Permission extends JsonEnum {

    Permission ADD_CHILD_UNITS = PermissionEnum.ADD_CHILD_UNITS;

    Permission UPDATE_ASSOCIATES = PermissionEnum.UPDATE_ASSOCIATES;

    Permission UPDATE_BUSINESS_UNIT_DETAILS = PermissionEnum.UPDATE_BUSINESS_UNIT_DETAILS;

    Permission UPDATE_PARENT_UNIT = PermissionEnum.UPDATE_PARENT_UNIT;

    Permission VIEW_MY_CARTS = PermissionEnum.VIEW_MY_CARTS;

    Permission VIEW_OTHERS_CARTS = PermissionEnum.VIEW_OTHERS_CARTS;

    Permission UPDATE_MY_CARTS = PermissionEnum.UPDATE_MY_CARTS;

    Permission UPDATE_OTHERS_CARTS = PermissionEnum.UPDATE_OTHERS_CARTS;

    Permission CREATE_MY_CARTS = PermissionEnum.CREATE_MY_CARTS;

    Permission CREATE_OTHERS_CARTS = PermissionEnum.CREATE_OTHERS_CARTS;

    Permission DELETE_MY_CARTS = PermissionEnum.DELETE_MY_CARTS;

    Permission DELETE_OTHERS_CARTS = PermissionEnum.DELETE_OTHERS_CARTS;

    Permission VIEW_MY_ORDERS = PermissionEnum.VIEW_MY_ORDERS;

    Permission VIEW_OTHERS_ORDERS = PermissionEnum.VIEW_OTHERS_ORDERS;

    Permission UPDATE_MY_ORDERS = PermissionEnum.UPDATE_MY_ORDERS;

    Permission UPDATE_OTHERS_ORDERS = PermissionEnum.UPDATE_OTHERS_ORDERS;

    Permission CREATE_MY_ORDERS_FROM_MY_CARTS = PermissionEnum.CREATE_MY_ORDERS_FROM_MY_CARTS;

    Permission CREATE_MY_ORDERS_FROM_MY_QUOTES = PermissionEnum.CREATE_MY_ORDERS_FROM_MY_QUOTES;

    Permission CREATE_ORDERS_FROM_OTHERS_CARTS = PermissionEnum.CREATE_ORDERS_FROM_OTHERS_CARTS;

    Permission CREATE_ORDERS_FROM_OTHERS_QUOTES = PermissionEnum.CREATE_ORDERS_FROM_OTHERS_QUOTES;

    Permission VIEW_MY_QUOTES = PermissionEnum.VIEW_MY_QUOTES;

    Permission VIEW_OTHERS_QUOTES = PermissionEnum.VIEW_OTHERS_QUOTES;

    Permission ACCEPT_MY_QUOTES = PermissionEnum.ACCEPT_MY_QUOTES;

    Permission ACCEPT_OTHERS_QUOTES = PermissionEnum.ACCEPT_OTHERS_QUOTES;

    Permission DECLINE_MY_QUOTES = PermissionEnum.DECLINE_MY_QUOTES;

    Permission DECLINE_OTHERS_QUOTES = PermissionEnum.DECLINE_OTHERS_QUOTES;

    Permission RENEGOTIATE_MY_QUOTES = PermissionEnum.RENEGOTIATE_MY_QUOTES;

    Permission RENEGOTIATE_OTHERS_QUOTES = PermissionEnum.RENEGOTIATE_OTHERS_QUOTES;

    Permission REASSIGN_MY_QUOTES = PermissionEnum.REASSIGN_MY_QUOTES;

    Permission REASSIGN_OTHERS_QUOTES = PermissionEnum.REASSIGN_OTHERS_QUOTES;

    Permission VIEW_MY_QUOTE_REQUESTS = PermissionEnum.VIEW_MY_QUOTE_REQUESTS;

    Permission VIEW_OTHERS_QUOTE_REQUESTS = PermissionEnum.VIEW_OTHERS_QUOTE_REQUESTS;

    Permission UPDATE_MY_QUOTE_REQUESTS = PermissionEnum.UPDATE_MY_QUOTE_REQUESTS;

    Permission UPDATE_OTHERS_QUOTE_REQUESTS = PermissionEnum.UPDATE_OTHERS_QUOTE_REQUESTS;

    Permission CREATE_MY_QUOTE_REQUESTS_FROM_MY_CARTS = PermissionEnum.CREATE_MY_QUOTE_REQUESTS_FROM_MY_CARTS;

    Permission CREATE_QUOTE_REQUESTS_FROM_OTHERS_CARTS = PermissionEnum.CREATE_QUOTE_REQUESTS_FROM_OTHERS_CARTS;

    Permission CREATE_APPROVAL_RULES = PermissionEnum.CREATE_APPROVAL_RULES;

    Permission UPDATE_APPROVAL_RULES = PermissionEnum.UPDATE_APPROVAL_RULES;

    Permission UPDATE_APPROVAL_FLOWS = PermissionEnum.UPDATE_APPROVAL_FLOWS;

    Permission VIEW_MY_SHOPPING_LISTS = PermissionEnum.VIEW_MY_SHOPPING_LISTS;

    Permission VIEW_OTHERS_SHOPPING_LISTS = PermissionEnum.VIEW_OTHERS_SHOPPING_LISTS;

    Permission UPDATE_MY_SHOPPING_LISTS = PermissionEnum.UPDATE_MY_SHOPPING_LISTS;

    Permission UPDATE_OTHERS_SHOPPING_LISTS = PermissionEnum.UPDATE_OTHERS_SHOPPING_LISTS;

    Permission CREATE_MY_SHOPPING_LISTS = PermissionEnum.CREATE_MY_SHOPPING_LISTS;

    Permission CREATE_OTHERS_SHOPPING_LISTS = PermissionEnum.CREATE_OTHERS_SHOPPING_LISTS;

    Permission DELETE_MY_SHOPPING_LISTS = PermissionEnum.DELETE_MY_SHOPPING_LISTS;

    Permission DELETE_OTHERS_SHOPPING_LISTS = PermissionEnum.DELETE_OTHERS_SHOPPING_LISTS;

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
        UPDATE_APPROVAL_FLOWS("UpdateApprovalFlows"),

        /**
         * ViewMyShoppingLists
         */
        VIEW_MY_SHOPPING_LISTS("ViewMyShoppingLists"),

        /**
         * ViewOthersShoppingLists
         */
        VIEW_OTHERS_SHOPPING_LISTS("ViewOthersShoppingLists"),

        /**
         * UpdateMyShoppingLists
         */
        UPDATE_MY_SHOPPING_LISTS("UpdateMyShoppingLists"),

        /**
         * UpdateOthersShoppingLists
         */
        UPDATE_OTHERS_SHOPPING_LISTS("UpdateOthersShoppingLists"),

        /**
         * CreateMyShoppingLists
         */
        CREATE_MY_SHOPPING_LISTS("CreateMyShoppingLists"),

        /**
         * CreateOthersShoppingLists
         */
        CREATE_OTHERS_SHOPPING_LISTS("CreateOthersShoppingLists"),

        /**
         * DeleteMyShoppingLists
         */
        DELETE_MY_SHOPPING_LISTS("DeleteMyShoppingLists"),

        /**
         * DeleteOthersShoppingLists
         */
        DELETE_OTHERS_SHOPPING_LISTS("DeleteOthersShoppingLists");
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
