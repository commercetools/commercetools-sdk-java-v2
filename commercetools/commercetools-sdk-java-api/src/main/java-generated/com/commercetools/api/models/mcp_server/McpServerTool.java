
package com.commercetools.api.models.mcp_server;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Identifies a tool that can be enabled on an MCP Server. For more information about the functions of each tool, see <span>Commerce MCP Server tools</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface McpServerTool extends JsonEnum {

    /**
    <p>Enables all available tools, including read, create, and update operations. For security and performance, enable this only when broad access is required.</p> */
    McpServerTool ALL = McpServerToolEnum.ALL;
    /**
    <p>Enables all read-only tools.</p> */
    McpServerTool READ_ALL = McpServerToolEnum.READ_ALL;
    /**
    <p>Creates Applications.</p> */
    McpServerTool CREATE_APPLICATIONS = McpServerToolEnum.CREATE_APPLICATIONS;
    /**
    <p>Reads Applications.</p> */
    McpServerTool READ_APPLICATIONS = McpServerToolEnum.READ_APPLICATIONS;
    /**
    <p>Updates Applications.</p> */
    McpServerTool UPDATE_APPLICATIONS = McpServerToolEnum.UPDATE_APPLICATIONS;
    /**
    <p>Creates Attribute Groups.</p> */
    McpServerTool CREATE_ATTRIBUTE_GROUPS = McpServerToolEnum.CREATE_ATTRIBUTE_GROUPS;
    /**
    <p>Reads Attribute Groups.</p> */
    McpServerTool READ_ATTRIBUTE_GROUPS = McpServerToolEnum.READ_ATTRIBUTE_GROUPS;
    /**
    <p>Updates Attribute Groups.</p> */
    McpServerTool UPDATE_ATTRIBUTE_GROUPS = McpServerToolEnum.UPDATE_ATTRIBUTE_GROUPS;
    /**
    <p>Creates resources in bulk.</p> */
    McpServerTool CREATE_BULK = McpServerToolEnum.CREATE_BULK;
    /**
    <p>Updates resources in bulk.</p> */
    McpServerTool UPDATE_BULK = McpServerToolEnum.UPDATE_BULK;
    /**
    <p>Creates Business Units.</p> */
    McpServerTool CREATE_BUSINESS_UNITS = McpServerToolEnum.CREATE_BUSINESS_UNITS;
    /**
    <p>Reads Business Units.</p> */
    McpServerTool READ_BUSINESS_UNITS = McpServerToolEnum.READ_BUSINESS_UNITS;
    /**
    <p>Updates Business Units.</p> */
    McpServerTool UPDATE_BUSINESS_UNITS = McpServerToolEnum.UPDATE_BUSINESS_UNITS;
    /**
    <p>Creates Cart Discounts.</p> */
    McpServerTool CREATE_CART_DISCOUNTS = McpServerToolEnum.CREATE_CART_DISCOUNTS;
    /**
    <p>Reads Cart Discounts.</p> */
    McpServerTool READ_CART_DISCOUNTS = McpServerToolEnum.READ_CART_DISCOUNTS;
    /**
    <p>Updates Cart Discounts.</p> */
    McpServerTool UPDATE_CART_DISCOUNTS = McpServerToolEnum.UPDATE_CART_DISCOUNTS;
    /**
    <p>Creates Carts.</p> */
    McpServerTool CREATE_CARTS = McpServerToolEnum.CREATE_CARTS;
    /**
    <p>Reads Carts.</p> */
    McpServerTool READ_CARTS = McpServerToolEnum.READ_CARTS;
    /**
    <p>Updates Carts.</p> */
    McpServerTool UPDATE_CARTS = McpServerToolEnum.UPDATE_CARTS;
    /**
    <p>Replicates an existing Cart or Order into a new Cart.</p> */
    McpServerTool REPLICATE_CARTS = McpServerToolEnum.REPLICATE_CARTS;
    /**
    <p>Creates Categories.</p> */
    McpServerTool CREATE_CATEGORIES = McpServerToolEnum.CREATE_CATEGORIES;
    /**
    <p>Reads Categories.</p> */
    McpServerTool READ_CATEGORIES = McpServerToolEnum.READ_CATEGORIES;
    /**
    <p>Updates Categories.</p> */
    McpServerTool UPDATE_CATEGORIES = McpServerToolEnum.UPDATE_CATEGORIES;
    /**
    <p>Creates Channels.</p> */
    McpServerTool CREATE_CHANNELS = McpServerToolEnum.CREATE_CHANNELS;
    /**
    <p>Reads Channels.</p> */
    McpServerTool READ_CHANNELS = McpServerToolEnum.READ_CHANNELS;
    /**
    <p>Updates Channels.</p> */
    McpServerTool UPDATE_CHANNELS = McpServerToolEnum.UPDATE_CHANNELS;
    /**
    <p>Creates Custom Objects.</p> */
    McpServerTool CREATE_CUSTOM_OBJECTS = McpServerToolEnum.CREATE_CUSTOM_OBJECTS;
    /**
    <p>Reads Custom Objects.</p> */
    McpServerTool READ_CUSTOM_OBJECTS = McpServerToolEnum.READ_CUSTOM_OBJECTS;
    /**
    <p>Updates Custom Objects.</p> */
    McpServerTool UPDATE_CUSTOM_OBJECTS = McpServerToolEnum.UPDATE_CUSTOM_OBJECTS;
    /**
    <p>Creates Customer Groups.</p> */
    McpServerTool CREATE_CUSTOMER_GROUPS = McpServerToolEnum.CREATE_CUSTOMER_GROUPS;
    /**
    <p>Reads Customer Groups.</p> */
    McpServerTool READ_CUSTOMER_GROUPS = McpServerToolEnum.READ_CUSTOMER_GROUPS;
    /**
    <p>Updates Customer Groups.</p> */
    McpServerTool UPDATE_CUSTOMER_GROUPS = McpServerToolEnum.UPDATE_CUSTOMER_GROUPS;
    /**
    <p>Searches for Customers.</p> */
    McpServerTool READ_CUSTOMER_SEARCH = McpServerToolEnum.READ_CUSTOMER_SEARCH;
    /**
    <p>Creates Customers.</p> */
    McpServerTool CREATE_CUSTOMERS = McpServerToolEnum.CREATE_CUSTOMERS;
    /**
    <p>Reads Customers.</p> */
    McpServerTool READ_CUSTOMERS = McpServerToolEnum.READ_CUSTOMERS;
    /**
    <p>Updates Customers.</p> */
    McpServerTool UPDATE_CUSTOMERS = McpServerToolEnum.UPDATE_CUSTOMERS;
    /**
    <p>Creates Discount Codes.</p> */
    McpServerTool CREATE_DISCOUNT_CODES = McpServerToolEnum.CREATE_DISCOUNT_CODES;
    /**
    <p>Reads Discount Codes.</p> */
    McpServerTool READ_DISCOUNT_CODES = McpServerToolEnum.READ_DISCOUNT_CODES;
    /**
    <p>Updates Discount Codes.</p> */
    McpServerTool UPDATE_DISCOUNT_CODES = McpServerToolEnum.UPDATE_DISCOUNT_CODES;
    /**
    <p>Creates API Extensions.</p> */
    McpServerTool CREATE_EXTENSIONS = McpServerToolEnum.CREATE_EXTENSIONS;
    /**
    <p>Reads API Extensions.</p> */
    McpServerTool READ_EXTENSIONS = McpServerToolEnum.READ_EXTENSIONS;
    /**
    <p>Updates API Extensions.</p> */
    McpServerTool UPDATE_EXTENSIONS = McpServerToolEnum.UPDATE_EXTENSIONS;
    /**
    <p>Creates Inventory.</p> */
    McpServerTool CREATE_INVENTORY = McpServerToolEnum.CREATE_INVENTORY;
    /**
    <p>Reads Inventory.</p> */
    McpServerTool READ_INVENTORY = McpServerToolEnum.READ_INVENTORY;
    /**
    <p>Updates Inventory.</p> */
    McpServerTool UPDATE_INVENTORY = McpServerToolEnum.UPDATE_INVENTORY;
    /**
    <p>Reads Messages.</p> */
    McpServerTool READ_MESSAGES = McpServerToolEnum.READ_MESSAGES;
    /**
    <p>Creates Orders.</p> */
    McpServerTool CREATE_ORDERS = McpServerToolEnum.CREATE_ORDERS;
    /**
    <p>Reads Orders.</p> */
    McpServerTool READ_ORDERS = McpServerToolEnum.READ_ORDERS;
    /**
    <p>Updates Orders.</p> */
    McpServerTool UPDATE_ORDERS = McpServerToolEnum.UPDATE_ORDERS;
    /**
    <p>Creates Payment Integrations.</p> */
    McpServerTool CREATE_PAYMENT_INTEGRATIONS = McpServerToolEnum.CREATE_PAYMENT_INTEGRATIONS;
    /**
    <p>Reads Payment Integrations.</p> */
    McpServerTool READ_PAYMENT_INTEGRATIONS = McpServerToolEnum.READ_PAYMENT_INTEGRATIONS;
    /**
    <p>Updates Payment Integrations.</p> */
    McpServerTool UPDATE_PAYMENT_INTEGRATIONS = McpServerToolEnum.UPDATE_PAYMENT_INTEGRATIONS;
    /**
    <p>Updates Payment Intents.</p> */
    McpServerTool UPDATE_PAYMENT_INTENTS = McpServerToolEnum.UPDATE_PAYMENT_INTENTS;
    /**
    <p>Creates Payment Methods.</p> */
    McpServerTool CREATE_PAYMENT_METHODS = McpServerToolEnum.CREATE_PAYMENT_METHODS;
    /**
    <p>Reads Payment Methods.</p> */
    McpServerTool READ_PAYMENT_METHODS = McpServerToolEnum.READ_PAYMENT_METHODS;
    /**
    <p>Updates Payment Methods.</p> */
    McpServerTool UPDATE_PAYMENT_METHODS = McpServerToolEnum.UPDATE_PAYMENT_METHODS;
    /**
    <p>Creates Payments.</p> */
    McpServerTool CREATE_PAYMENTS = McpServerToolEnum.CREATE_PAYMENTS;
    /**
    <p>Reads Payments.</p> */
    McpServerTool READ_PAYMENTS = McpServerToolEnum.READ_PAYMENTS;
    /**
    <p>Updates Payments.</p> */
    McpServerTool UPDATE_PAYMENTS = McpServerToolEnum.UPDATE_PAYMENTS;
    /**
    <p>Creates Product Discounts.</p> */
    McpServerTool CREATE_PRODUCT_DISCOUNTS = McpServerToolEnum.CREATE_PRODUCT_DISCOUNTS;
    /**
    <p>Reads Product Discounts.</p> */
    McpServerTool READ_PRODUCT_DISCOUNTS = McpServerToolEnum.READ_PRODUCT_DISCOUNTS;
    /**
    <p>Updates Product Discounts.</p> */
    McpServerTool UPDATE_PRODUCT_DISCOUNTS = McpServerToolEnum.UPDATE_PRODUCT_DISCOUNTS;
    /**
    <p>Reads Product Projections.</p> */
    McpServerTool READ_PRODUCT_PROJECTIONS = McpServerToolEnum.READ_PRODUCT_PROJECTIONS;
    /**
    <p>Searches for Products.</p> */
    McpServerTool READ_PRODUCT_SEARCH = McpServerToolEnum.READ_PRODUCT_SEARCH;
    /**
    <p>Creates Product Selections.</p> */
    McpServerTool CREATE_PRODUCT_SELECTIONS = McpServerToolEnum.CREATE_PRODUCT_SELECTIONS;
    /**
    <p>Reads Product Selections.</p> */
    McpServerTool READ_PRODUCT_SELECTIONS = McpServerToolEnum.READ_PRODUCT_SELECTIONS;
    /**
    <p>Updates Product Selections.</p> */
    McpServerTool UPDATE_PRODUCT_SELECTIONS = McpServerToolEnum.UPDATE_PRODUCT_SELECTIONS;
    /**
    <p>Creates Product Tailoring.</p> */
    McpServerTool CREATE_PRODUCT_TAILORING = McpServerToolEnum.CREATE_PRODUCT_TAILORING;
    /**
    <p>Reads Product Tailoring.</p> */
    McpServerTool READ_PRODUCT_TAILORING = McpServerToolEnum.READ_PRODUCT_TAILORING;
    /**
    <p>Updates Product Tailoring.</p> */
    McpServerTool UPDATE_PRODUCT_TAILORING = McpServerToolEnum.UPDATE_PRODUCT_TAILORING;
    /**
    <p>Creates Product Types.</p> */
    McpServerTool CREATE_PRODUCT_TYPES = McpServerToolEnum.CREATE_PRODUCT_TYPES;
    /**
    <p>Reads Product Types.</p> */
    McpServerTool READ_PRODUCT_TYPES = McpServerToolEnum.READ_PRODUCT_TYPES;
    /**
    <p>Updates Product Types.</p> */
    McpServerTool UPDATE_PRODUCT_TYPES = McpServerToolEnum.UPDATE_PRODUCT_TYPES;
    /**
    <p>Creates Products.</p> */
    McpServerTool CREATE_PRODUCTS = McpServerToolEnum.CREATE_PRODUCTS;
    /**
    <p>Reads Products.</p> */
    McpServerTool READ_PRODUCTS = McpServerToolEnum.READ_PRODUCTS;
    /**
    <p>Updates Products.</p> */
    McpServerTool UPDATE_PRODUCTS = McpServerToolEnum.UPDATE_PRODUCTS;
    /**
    <p>Reads Project settings.</p> */
    McpServerTool READ_PROJECT = McpServerToolEnum.READ_PROJECT;
    /**
    <p>Updates Project settings.</p> */
    McpServerTool UPDATE_PROJECT = McpServerToolEnum.UPDATE_PROJECT;
    /**
    <p>Creates Quote Requests.</p> */
    McpServerTool CREATE_QUOTE_REQUESTS = McpServerToolEnum.CREATE_QUOTE_REQUESTS;
    /**
    <p>Reads Quote Requests.</p> */
    McpServerTool READ_QUOTE_REQUESTS = McpServerToolEnum.READ_QUOTE_REQUESTS;
    /**
    <p>Updates Quote Requests.</p> */
    McpServerTool UPDATE_QUOTE_REQUESTS = McpServerToolEnum.UPDATE_QUOTE_REQUESTS;
    /**
    <p>Creates Quotes.</p> */
    McpServerTool CREATE_QUOTES = McpServerToolEnum.CREATE_QUOTES;
    /**
    <p>Reads Quotes.</p> */
    McpServerTool READ_QUOTES = McpServerToolEnum.READ_QUOTES;
    /**
    <p>Updates Quotes.</p> */
    McpServerTool UPDATE_QUOTES = McpServerToolEnum.UPDATE_QUOTES;
    /**
    <p>Creates Recurring Orders.</p> */
    McpServerTool CREATE_RECURRING_ORDERS = McpServerToolEnum.CREATE_RECURRING_ORDERS;
    /**
    <p>Reads Recurring Orders.</p> */
    McpServerTool READ_RECURRING_ORDERS = McpServerToolEnum.READ_RECURRING_ORDERS;
    /**
    <p>Updates Recurring Orders.</p> */
    McpServerTool UPDATE_RECURRING_ORDERS = McpServerToolEnum.UPDATE_RECURRING_ORDERS;
    /**
    <p>Creates Reviews.</p> */
    McpServerTool CREATE_REVIEWS = McpServerToolEnum.CREATE_REVIEWS;
    /**
    <p>Reads Reviews.</p> */
    McpServerTool READ_REVIEWS = McpServerToolEnum.READ_REVIEWS;
    /**
    <p>Updates Reviews.</p> */
    McpServerTool UPDATE_REVIEWS = McpServerToolEnum.UPDATE_REVIEWS;
    /**
    <p>Creates Shipping Methods.</p> */
    McpServerTool CREATE_SHIPPING_METHODS = McpServerToolEnum.CREATE_SHIPPING_METHODS;
    /**
    <p>Reads Shipping Methods.</p> */
    McpServerTool READ_SHIPPING_METHODS = McpServerToolEnum.READ_SHIPPING_METHODS;
    /**
    <p>Updates Shipping Methods.</p> */
    McpServerTool UPDATE_SHIPPING_METHODS = McpServerToolEnum.UPDATE_SHIPPING_METHODS;
    /**
    <p>Creates Shopping Lists.</p> */
    McpServerTool CREATE_SHOPPING_LISTS = McpServerToolEnum.CREATE_SHOPPING_LISTS;
    /**
    <p>Reads Shopping Lists.</p> */
    McpServerTool READ_SHOPPING_LISTS = McpServerToolEnum.READ_SHOPPING_LISTS;
    /**
    <p>Updates Shopping Lists.</p> */
    McpServerTool UPDATE_SHOPPING_LISTS = McpServerToolEnum.UPDATE_SHOPPING_LISTS;
    /**
    <p>Creates Staged Quotes.</p> */
    McpServerTool CREATE_STAGED_QUOTES = McpServerToolEnum.CREATE_STAGED_QUOTES;
    /**
    <p>Reads Staged Quotes.</p> */
    McpServerTool READ_STAGED_QUOTES = McpServerToolEnum.READ_STAGED_QUOTES;
    /**
    <p>Updates Staged Quotes.</p> */
    McpServerTool UPDATE_STAGED_QUOTES = McpServerToolEnum.UPDATE_STAGED_QUOTES;
    /**
    <p>Creates Standalone Prices.</p> */
    McpServerTool CREATE_STANDALONE_PRICES = McpServerToolEnum.CREATE_STANDALONE_PRICES;
    /**
    <p>Reads Standalone Prices.</p> */
    McpServerTool READ_STANDALONE_PRICES = McpServerToolEnum.READ_STANDALONE_PRICES;
    /**
    <p>Updates Standalone Prices.</p> */
    McpServerTool UPDATE_STANDALONE_PRICES = McpServerToolEnum.UPDATE_STANDALONE_PRICES;
    /**
    <p>Creates States.</p> */
    McpServerTool CREATE_STATES = McpServerToolEnum.CREATE_STATES;
    /**
    <p>Reads States.</p> */
    McpServerTool READ_STATES = McpServerToolEnum.READ_STATES;
    /**
    <p>Updates States.</p> */
    McpServerTool UPDATE_STATES = McpServerToolEnum.UPDATE_STATES;
    /**
    <p>Creates Stores.</p> */
    McpServerTool CREATE_STORES = McpServerToolEnum.CREATE_STORES;
    /**
    <p>Reads Stores.</p> */
    McpServerTool READ_STORES = McpServerToolEnum.READ_STORES;
    /**
    <p>Updates Stores.</p> */
    McpServerTool UPDATE_STORES = McpServerToolEnum.UPDATE_STORES;
    /**
    <p>Creates Subscriptions.</p> */
    McpServerTool CREATE_SUBSCRIPTIONS = McpServerToolEnum.CREATE_SUBSCRIPTIONS;
    /**
    <p>Reads Subscriptions.</p> */
    McpServerTool READ_SUBSCRIPTIONS = McpServerToolEnum.READ_SUBSCRIPTIONS;
    /**
    <p>Updates Subscriptions.</p> */
    McpServerTool UPDATE_SUBSCRIPTIONS = McpServerToolEnum.UPDATE_SUBSCRIPTIONS;
    /**
    <p>Creates Tax Categories.</p> */
    McpServerTool CREATE_TAX_CATEGORIES = McpServerToolEnum.CREATE_TAX_CATEGORIES;
    /**
    <p>Reads Tax Categories.</p> */
    McpServerTool READ_TAX_CATEGORIES = McpServerToolEnum.READ_TAX_CATEGORIES;
    /**
    <p>Updates Tax Categories.</p> */
    McpServerTool UPDATE_TAX_CATEGORIES = McpServerToolEnum.UPDATE_TAX_CATEGORIES;
    /**
    <p>Creates Transactions.</p> */
    McpServerTool CREATE_TRANSACTIONS = McpServerToolEnum.CREATE_TRANSACTIONS;
    /**
    <p>Reads Transactions.</p> */
    McpServerTool READ_TRANSACTIONS = McpServerToolEnum.READ_TRANSACTIONS;
    /**
    <p>Creates Types.</p> */
    McpServerTool CREATE_TYPES = McpServerToolEnum.CREATE_TYPES;
    /**
    <p>Reads Types.</p> */
    McpServerTool READ_TYPES = McpServerToolEnum.READ_TYPES;
    /**
    <p>Updates Types.</p> */
    McpServerTool UPDATE_TYPES = McpServerToolEnum.UPDATE_TYPES;
    /**
    <p>Creates Zones.</p> */
    McpServerTool CREATE_ZONES = McpServerToolEnum.CREATE_ZONES;
    /**
    <p>Reads Zones.</p> */
    McpServerTool READ_ZONES = McpServerToolEnum.READ_ZONES;
    /**
    <p>Updates Zones.</p> */
    McpServerTool UPDATE_ZONES = McpServerToolEnum.UPDATE_ZONES;

    /**
     * possible values of McpServerTool
     */
    enum McpServerToolEnum implements McpServerTool {
        /**
         * all
         */
        ALL("all"),

        /**
         * read_all
         */
        READ_ALL("read_all"),

        /**
         * create_applications
         */
        CREATE_APPLICATIONS("create_applications"),

        /**
         * read_applications
         */
        READ_APPLICATIONS("read_applications"),

        /**
         * update_applications
         */
        UPDATE_APPLICATIONS("update_applications"),

        /**
         * create_attribute_groups
         */
        CREATE_ATTRIBUTE_GROUPS("create_attribute_groups"),

        /**
         * read_attribute_groups
         */
        READ_ATTRIBUTE_GROUPS("read_attribute_groups"),

        /**
         * update_attribute_groups
         */
        UPDATE_ATTRIBUTE_GROUPS("update_attribute_groups"),

        /**
         * create_bulk
         */
        CREATE_BULK("create_bulk"),

        /**
         * update_bulk
         */
        UPDATE_BULK("update_bulk"),

        /**
         * create_business_units
         */
        CREATE_BUSINESS_UNITS("create_business_units"),

        /**
         * read_business_units
         */
        READ_BUSINESS_UNITS("read_business_units"),

        /**
         * update_business_units
         */
        UPDATE_BUSINESS_UNITS("update_business_units"),

        /**
         * create_cart_discounts
         */
        CREATE_CART_DISCOUNTS("create_cart_discounts"),

        /**
         * read_cart_discounts
         */
        READ_CART_DISCOUNTS("read_cart_discounts"),

        /**
         * update_cart_discounts
         */
        UPDATE_CART_DISCOUNTS("update_cart_discounts"),

        /**
         * create_carts
         */
        CREATE_CARTS("create_carts"),

        /**
         * read_carts
         */
        READ_CARTS("read_carts"),

        /**
         * update_carts
         */
        UPDATE_CARTS("update_carts"),

        /**
         * replicate_carts
         */
        REPLICATE_CARTS("replicate_carts"),

        /**
         * create_categories
         */
        CREATE_CATEGORIES("create_categories"),

        /**
         * read_categories
         */
        READ_CATEGORIES("read_categories"),

        /**
         * update_categories
         */
        UPDATE_CATEGORIES("update_categories"),

        /**
         * create_channels
         */
        CREATE_CHANNELS("create_channels"),

        /**
         * read_channels
         */
        READ_CHANNELS("read_channels"),

        /**
         * update_channels
         */
        UPDATE_CHANNELS("update_channels"),

        /**
         * create_custom_objects
         */
        CREATE_CUSTOM_OBJECTS("create_custom_objects"),

        /**
         * read_custom_objects
         */
        READ_CUSTOM_OBJECTS("read_custom_objects"),

        /**
         * update_custom_objects
         */
        UPDATE_CUSTOM_OBJECTS("update_custom_objects"),

        /**
         * create_customer_groups
         */
        CREATE_CUSTOMER_GROUPS("create_customer_groups"),

        /**
         * read_customer_groups
         */
        READ_CUSTOMER_GROUPS("read_customer_groups"),

        /**
         * update_customer_groups
         */
        UPDATE_CUSTOMER_GROUPS("update_customer_groups"),

        /**
         * read_customer_search
         */
        READ_CUSTOMER_SEARCH("read_customer_search"),

        /**
         * create_customers
         */
        CREATE_CUSTOMERS("create_customers"),

        /**
         * read_customers
         */
        READ_CUSTOMERS("read_customers"),

        /**
         * update_customers
         */
        UPDATE_CUSTOMERS("update_customers"),

        /**
         * create_discount_codes
         */
        CREATE_DISCOUNT_CODES("create_discount_codes"),

        /**
         * read_discount_codes
         */
        READ_DISCOUNT_CODES("read_discount_codes"),

        /**
         * update_discount_codes
         */
        UPDATE_DISCOUNT_CODES("update_discount_codes"),

        /**
         * create_extensions
         */
        CREATE_EXTENSIONS("create_extensions"),

        /**
         * read_extensions
         */
        READ_EXTENSIONS("read_extensions"),

        /**
         * update_extensions
         */
        UPDATE_EXTENSIONS("update_extensions"),

        /**
         * create_inventory
         */
        CREATE_INVENTORY("create_inventory"),

        /**
         * read_inventory
         */
        READ_INVENTORY("read_inventory"),

        /**
         * update_inventory
         */
        UPDATE_INVENTORY("update_inventory"),

        /**
         * read_messages
         */
        READ_MESSAGES("read_messages"),

        /**
         * create_orders
         */
        CREATE_ORDERS("create_orders"),

        /**
         * read_orders
         */
        READ_ORDERS("read_orders"),

        /**
         * update_orders
         */
        UPDATE_ORDERS("update_orders"),

        /**
         * create_payment_integrations
         */
        CREATE_PAYMENT_INTEGRATIONS("create_payment_integrations"),

        /**
         * read_payment_integrations
         */
        READ_PAYMENT_INTEGRATIONS("read_payment_integrations"),

        /**
         * update_payment_integrations
         */
        UPDATE_PAYMENT_INTEGRATIONS("update_payment_integrations"),

        /**
         * update_payment_intents
         */
        UPDATE_PAYMENT_INTENTS("update_payment_intents"),

        /**
         * create_payment_methods
         */
        CREATE_PAYMENT_METHODS("create_payment_methods"),

        /**
         * read_payment_methods
         */
        READ_PAYMENT_METHODS("read_payment_methods"),

        /**
         * update_payment_methods
         */
        UPDATE_PAYMENT_METHODS("update_payment_methods"),

        /**
         * create_payments
         */
        CREATE_PAYMENTS("create_payments"),

        /**
         * read_payments
         */
        READ_PAYMENTS("read_payments"),

        /**
         * update_payments
         */
        UPDATE_PAYMENTS("update_payments"),

        /**
         * create_product_discounts
         */
        CREATE_PRODUCT_DISCOUNTS("create_product_discounts"),

        /**
         * read_product_discounts
         */
        READ_PRODUCT_DISCOUNTS("read_product_discounts"),

        /**
         * update_product_discounts
         */
        UPDATE_PRODUCT_DISCOUNTS("update_product_discounts"),

        /**
         * read_product_projections
         */
        READ_PRODUCT_PROJECTIONS("read_product_projections"),

        /**
         * read_product_search
         */
        READ_PRODUCT_SEARCH("read_product_search"),

        /**
         * create_product_selections
         */
        CREATE_PRODUCT_SELECTIONS("create_product_selections"),

        /**
         * read_product_selections
         */
        READ_PRODUCT_SELECTIONS("read_product_selections"),

        /**
         * update_product_selections
         */
        UPDATE_PRODUCT_SELECTIONS("update_product_selections"),

        /**
         * create_product_tailoring
         */
        CREATE_PRODUCT_TAILORING("create_product_tailoring"),

        /**
         * read_product_tailoring
         */
        READ_PRODUCT_TAILORING("read_product_tailoring"),

        /**
         * update_product_tailoring
         */
        UPDATE_PRODUCT_TAILORING("update_product_tailoring"),

        /**
         * create_product_types
         */
        CREATE_PRODUCT_TYPES("create_product_types"),

        /**
         * read_product_types
         */
        READ_PRODUCT_TYPES("read_product_types"),

        /**
         * update_product_types
         */
        UPDATE_PRODUCT_TYPES("update_product_types"),

        /**
         * create_products
         */
        CREATE_PRODUCTS("create_products"),

        /**
         * read_products
         */
        READ_PRODUCTS("read_products"),

        /**
         * update_products
         */
        UPDATE_PRODUCTS("update_products"),

        /**
         * read_project
         */
        READ_PROJECT("read_project"),

        /**
         * update_project
         */
        UPDATE_PROJECT("update_project"),

        /**
         * create_quote_requests
         */
        CREATE_QUOTE_REQUESTS("create_quote_requests"),

        /**
         * read_quote_requests
         */
        READ_QUOTE_REQUESTS("read_quote_requests"),

        /**
         * update_quote_requests
         */
        UPDATE_QUOTE_REQUESTS("update_quote_requests"),

        /**
         * create_quotes
         */
        CREATE_QUOTES("create_quotes"),

        /**
         * read_quotes
         */
        READ_QUOTES("read_quotes"),

        /**
         * update_quotes
         */
        UPDATE_QUOTES("update_quotes"),

        /**
         * create_recurring_orders
         */
        CREATE_RECURRING_ORDERS("create_recurring_orders"),

        /**
         * read_recurring_orders
         */
        READ_RECURRING_ORDERS("read_recurring_orders"),

        /**
         * update_recurring_orders
         */
        UPDATE_RECURRING_ORDERS("update_recurring_orders"),

        /**
         * create_reviews
         */
        CREATE_REVIEWS("create_reviews"),

        /**
         * read_reviews
         */
        READ_REVIEWS("read_reviews"),

        /**
         * update_reviews
         */
        UPDATE_REVIEWS("update_reviews"),

        /**
         * create_shipping_methods
         */
        CREATE_SHIPPING_METHODS("create_shipping_methods"),

        /**
         * read_shipping_methods
         */
        READ_SHIPPING_METHODS("read_shipping_methods"),

        /**
         * update_shipping_methods
         */
        UPDATE_SHIPPING_METHODS("update_shipping_methods"),

        /**
         * create_shopping_lists
         */
        CREATE_SHOPPING_LISTS("create_shopping_lists"),

        /**
         * read_shopping_lists
         */
        READ_SHOPPING_LISTS("read_shopping_lists"),

        /**
         * update_shopping_lists
         */
        UPDATE_SHOPPING_LISTS("update_shopping_lists"),

        /**
         * create_staged_quotes
         */
        CREATE_STAGED_QUOTES("create_staged_quotes"),

        /**
         * read_staged_quotes
         */
        READ_STAGED_QUOTES("read_staged_quotes"),

        /**
         * update_staged_quotes
         */
        UPDATE_STAGED_QUOTES("update_staged_quotes"),

        /**
         * create_standalone_prices
         */
        CREATE_STANDALONE_PRICES("create_standalone_prices"),

        /**
         * read_standalone_prices
         */
        READ_STANDALONE_PRICES("read_standalone_prices"),

        /**
         * update_standalone_prices
         */
        UPDATE_STANDALONE_PRICES("update_standalone_prices"),

        /**
         * create_states
         */
        CREATE_STATES("create_states"),

        /**
         * read_states
         */
        READ_STATES("read_states"),

        /**
         * update_states
         */
        UPDATE_STATES("update_states"),

        /**
         * create_stores
         */
        CREATE_STORES("create_stores"),

        /**
         * read_stores
         */
        READ_STORES("read_stores"),

        /**
         * update_stores
         */
        UPDATE_STORES("update_stores"),

        /**
         * create_subscriptions
         */
        CREATE_SUBSCRIPTIONS("create_subscriptions"),

        /**
         * read_subscriptions
         */
        READ_SUBSCRIPTIONS("read_subscriptions"),

        /**
         * update_subscriptions
         */
        UPDATE_SUBSCRIPTIONS("update_subscriptions"),

        /**
         * create_tax_categories
         */
        CREATE_TAX_CATEGORIES("create_tax_categories"),

        /**
         * read_tax_categories
         */
        READ_TAX_CATEGORIES("read_tax_categories"),

        /**
         * update_tax_categories
         */
        UPDATE_TAX_CATEGORIES("update_tax_categories"),

        /**
         * create_transactions
         */
        CREATE_TRANSACTIONS("create_transactions"),

        /**
         * read_transactions
         */
        READ_TRANSACTIONS("read_transactions"),

        /**
         * create_types
         */
        CREATE_TYPES("create_types"),

        /**
         * read_types
         */
        READ_TYPES("read_types"),

        /**
         * update_types
         */
        UPDATE_TYPES("update_types"),

        /**
         * create_zones
         */
        CREATE_ZONES("create_zones"),

        /**
         * read_zones
         */
        READ_ZONES("read_zones"),

        /**
         * update_zones
         */
        UPDATE_ZONES("update_zones");
        private final String jsonName;

        private McpServerToolEnum(final String jsonName) {
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
     * factory method for a enum value of McpServerTool
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static McpServerTool findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new McpServerTool() {
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
    public static Optional<McpServerTool> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static McpServerTool[] values() {
        return McpServerToolEnum.values();
    }

}
