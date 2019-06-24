package com.dfn.oms.newgen.testClientUI.bean;


/**
 * Created by samurdiw on 10/19/2016.
 */
public enum ErrorCodes implements ErrorCodesI {
    ERROR_DEFAULT(-1, "OMS UNKNOWN ERROR"), EXEC_BROKER_NOT_FOUND(2, "EXEC BROKER NOT FOUND"), VALIDATION_ERROR_DEFAULT(3, "VALIDATION ERROR:DEFAULT"),
    INVALID_SESSION(4, "Session invalid"), SYMBOL_NOT_FOUND(5, "SYMBOL NOT FOUND"),
    TRADE_DISABLED_SYMBOL(6, "TRADE_DISABLED_SYMBOL"), ONLINE_TRADE_DISABLED_SYMBOL(7, "ONLINE TRADE DISABLED SYMBOL"),
    SYMBOL_STATUS_NOT_APPROVED(8, "SYMBOL NOT APPROVED"), SYMBOL_NOT_ALLOWED_TO_BUY(9, "SYMBOL NOT ALLOWED TO BUY"),
    SYMBOL_NOT_ALLOWED_TO_SELL(10, "SYMBOL NOT ALLOWED TO SELL"), SYMBOL_NOT_ALLOWED_TO_BUY_OR_SELL(11, "SYMBOL NOT ALLOWED TO BUY,SELL"),
    EXCHANGE_NOT_FOUND(12, "EXCHANGE NOT FOUND"), TRADING_ACNT_NT_FND(13, "TRADING ACCOUNT NOT FOUND"), CUSTOMER_NOT_FOUND(14, "CUSTOMER NOT FOUND"),
    CASH_ACNT_NT_FND(15, "CASH ACCOUNT NOT FOUND"), TRADING_ACNT_TRADE_NOT_ENABLE(16, "TRADING ACCOUNT TRADE DISABLED"),
    SYMBOL_STATUS_INVALID(17, "INVALID SYMBOL STATUS"), TRADING_ACNT_NOT_ALLOWED_TO_BUY(18, "TRADING ACCOUNT NOT ALLOWED TO BUY"),
    SYMBOL_TRADABLE_STATUS_DISABLED(19, "SYMBOL STATUS NOT TRADE ALLOWED"), TRADING_ACNT_NOT_ALLOWED_TO_SELL(20, "TRADING ACCOUNT NOT ALLOWED TO SELL"),
    MEM_MAP_ERROR_DEFAULT(21, "MEM MAP ERROR:DEFAULT"), TRADING_ACNT_NOT_ALLOWED_TO_BUY_SELL(22, "TRADING ACCOUNT NOT ALLOWED TO BUY,SELL"),
    TRADING_MARKET_NOT_FOUND(23, "TRADING MARKET NOT FOUND"), TRADING_ACNT_SYMBOL_RESTRICTED_TO_BUY(24, "TRADING ACCNT_SYMBOL_RESTRICTED TO BUY"),
    CURRENCY_RATE_NOT_DEFINED(25, "CURRENCY RATE NOT DEFINED"), TRADING_ACNT_SYMBOL_RESTRICTED_TO_SELL(26, " TRADING ACCNT_SYMBOL_RESTRICTED TO SELL"),
    DAO_ERROR(27, "DAO_ERROR"), ROUTING_BEAN_NOT_FOUND(28, "ROUTING ACCOUNT NOT FOUND"), EMPLOYEE_NOT_FOUND(29, "EMPLOYEE NOT FOUND"),
    TRADING_ACNT_TRADE_RESTRICTED_CHANNEL(30, "TRADING ACCNT RESTRICTED CHANNEL"), TRADING_CONNECTION_DOWN(31, "TRADING CONNECTION DOWN"),
    CUSTOMER_NOT_APPROVED(32, "NOT A APPROVED CUSTOMER"), EMPLOYEE_NOT_APPROVED(33, "EMPLOYEE NOT APPROVED"),
    CUSTOMER_TRADING_DISABLE(34, "CUSTOMER_TRADE_DISABLED"), TRADING_ACNT_NOT_ACTIVE(35, "INACTIVE TRADING ACCOUNT"),
    CUSTOMER_ONLINE_TRADING_DISABLE(36, "CUSTOMER_ONLINE_TRADE_DISABLED"), INSTITUTION_NOT_FOUND(37, "INSTITUTION NOT FOUND"),
    TRADE_ACNT_EXCHANGE_ORD_EXCHANGE_MISMATCH(38, "TRADE ACCOUNT EXCHANGE MISMATCH"), SEQUENCE_NOT_FOUND(39, "SEQUENCE NOT FOUND"),
    TRADE_ACNT_ONLINE_TRADING_DISABLE(40, "TRADING ACCOUNT ONLINE TRADE DISABLED"), ORDER_SEQUENCE_NOT_FOUND(41, "ORDER SEQUENCE_NOT_FOUND"),
    SYMBOL_CUSTOMER_NATIONALITY_MISMATCH(42, "SYMBOL CUSTOMER COUNTRY MISMATCH"), SETTLEMENT_CALC_NOT_FOUND(43, "SETTLEMENT CALENDAR NOT FOUND"),
    OFFLINE_ORDER_NOT_ALLOWED_FOR_INSTITUTE(44, "OFFLINE ORDER NOT ALLOWED FOR INSTITUTE"), POA_NOT_ALLOWED_TO_SELL(45, "POA NOT ALLOWED TO SELL"),
    MARKET_ORDER_NOT_ALLOWED_AS_OFFLINE(46, "MARKET ORDER NOT ALLOWED AT MARKET CLOSE"), POA_NOT_ALLOWED_TO_BUY(47, "POA NOT ALLOWED TO BUY"),
    INSTRUMENT_NOT_ALLOWED_TO_SELL(48, "INSTRUMENT TYPE NOT ALLOWED TO SELL"), INSTRUMENT_NOT_ALLOWED_TO_BUY(49, "INSTRUMENT TYPE NOT ALLOWED TO BUY"),
    INVALID_ORD_QTY(50, "QUANTITY INVALID"), INVALID_MIN_ORD_QTY(51, "MIN QUANTITY INVALID"), INVALID_MAX_QTY(52, "MAX QUANTITY INVALID"),
    INVALID_LIMIT_PRICE(53, "LIMIT PRICE INVAlID"), CUSTODIAN_ID_INVALID(54, "CUSTODIAN ID INVALID"),
    OFFLINE_AMEND_REJECT(55, "OFFLINE ORDER AMEND REJECT"), ORD_PRICE_NOT_IN_MIN_MAX(56, "ORD PRICE NOT WITHIN MIN MAX"),
    INVALID_ORDER_COMMISSION(57, "ORDER COMMISSION INVALID"), INVALID_EXEC_BROKER_COMMISSION(58, "EXEC BROKER COMMISSION INVALID"),
    INVALID_CUSTOMER_COMMISSION(59, "CUSTOMER COMMISSION INVALID"),
    INVALID_ORDER_VALUE(60, "ORDER VALUE INVALID"), INVALID_ORDER_NET_VALUE(61, "ORDER NET VALUE INVALID"),
    INVALID_GTD_ORD_DATE(62, "GTD ORDER DATE INVALID"), INVALID_EXECUTION_TRANSACTION_TYPE(63, "INVALID EXECUTION TRANSACTION TYPE FOUND"),
    OLD_ORDER_NOT_FOUND(64, "OLD ORDER NOT FOUND"),
    INVALID_MKT_STATUS_TIF(65, "TIF NOT ALLOWED WITH MARKET STATUS"), INVALID_MKT_STATUS_ACTION(66, "ORDER ACTION NOT ALLOWED WITH MARKET STATUS"),
    INVALID_SOCK_CONCENTRATION(67, "Exceed maximum stock concentration ratio for the stock"),
    MKT_ORD_NOT_ALLOWED_AS_OFFLINE_ORD(68, "MARKET ORDER NOT ALLOWED AS OFFLINE"),
    INSUFFICIENT_BUYING_POWER(69, "INSUFFICIENT BUYING POWER"), INSUFFICIENT_HOLDINGS(70, "INSUFFICIENT HOLDINGS"),
    NET_SETTLE_INVALID(71, "INVALID NET SETTLE"), TENANT_INVALID(72, "INVALID TENANT"),
    INVALID_EXEC_BROKER_CODE(73, "EXECUTION BROKER INVALID"), SEND_TO_OMS_NEW_ACTION_NOT_ALLOWED(74, "SEND TO OMS NEW ORDER ACTION NOT ALLOWED"),
    ORDER_AMEND_REJECT_INVALID_ORDER_QTY(75, "ORDER AMEND REJECT INVALID ORDERQTY"), INVALID_ORDER_NO(76, "INVALID ORDER NUMBER"),
    MARKET_RESTRICTION_NOT_FOUND(77, "MARKET_RESTRICTION_DATA_NOT_FOUND"), COMMISSION_NOT_DEFINED(78, "COMMISSION_NOT_DEFINED"),
    FXRATE_NOT_DEFINED(79, "FXRATE_NOT_DEFINED"),
    VALIDATE_FAILURE_EXCEPTION(80, "ORDER VALIDATION FAILURE EXCEPTION FOUND:"), DAO_EXCEPTION(81, "DAO EXCEPTION FOUND"),
    MEMORY_MAP_EXCEPTION(82, "MEMORY MAP EXCEPTION FOUND"),
    NUMBER_FORMAT_ERROR(83, "NUMBER FORMAT ERROR"), DATE_PARSE_ERROR(84, "DATE PARSE ERROR"),
    TRDNG_MKT_STATUS_UPDATE_ERROR(85, "TRADING MARKET STATUS UPDATE DAO ERROR"),
    CACHE_MON_AUDIT_UPDATE_ERROR(86, "AUDIT UPDATE DAO ERROR"), TRADNG_MKT_STATUS_REQ_DATE_ERROR(87, "TRADING MARKET STATUS REQ DATE DAO ERROR"),
    INSTRUMENT_NOT_ALLOWED_TO_BUY_OR_SELL(88, "INSTRUMENT TYPE NOT ALLOWED TO BUY/SELL"), INVALID_LOGIN_ID(89, "Login ID Invalid"),
    LOGIN_ID_TRADE_ACNT_NOT_MATCHED(90, "TRADING ACCOUNT NOT ALLOWED FOR LOGIN ID"),
    LOGIN_ID_CASH_ACNT_NOT_MATCHED(91, "CASH ACCOUNT NOT ALLOWED FOR LOGIN ID"),
    INVALID_CASH_TRANSFER_AMOUNT(92, "INVALID_CASH_TRANSFER_AMOUNT"), INVALID_TRANSFER_RWQ_ID(93, "Invalid transaction number for Approve"),
    INVALID_TRANSFER_CODE(94, "Invalid transfer request Type"), INVALID_APPROVE_LEVEL(95, "Invalid approve level"),
    NOT_ENOUGH_CASH_BALANCE(96, "Cash Balance is not enough for Transaction"),
    INVALID_APPROVED_STATUS(97, "Current Record is not in valid State"),
    FILLED_ACTION_NOT_ALLOWED(98, "ORDER ACTION REJECT - FILLED ORDER"), AUDIT_PERSIST_ERROR(99, "AUDIT ENTRY PERSIST ERROR"),
    RECOVERY_ENTRY_PERSIST_ERROR(100, "RECOVERY ENTRY PERSIST ERROR"), ORDER_PROCESS_FLOW_EXCEPTION(101, "ORDER_PROCESS_FLOW_EXCEPTION"),
    OMSV_WAITING_FOR_APPROVE_OR_CONFIRMATION(102, "OMSV_WAITING_FOR_APPROVE_OR_CONFIRMATION"), ORDER_PERSIST_ERROR(103, "ORDER_PERSIST_ERROR"),
    CASH_TRNSFER_MANUL_BLOCKED(104, "Manual Cash Transfer blocked"), CASH_DEPOSIT_RESTRICTED(105, "Cash Deposit Restricted"),
    CASH_WITHDRAW_RESTRICTED(106, "Cash Withdraw Restricted"),
    CASH_TRANSFER_RESTRICTED(107, "Cash Transfer Restricted"), CASH_TRANSFER_EXCEED_OVERDRAWN_LIMIT(108, "Exceed allowed overdrawn Limit"),
    CASH_TRANSFER_AMT_MUST_EXCEED_MINSTPVALUE(109, "Transfer amount should be grater than min order value"),
    CASH_TRANSFER_NEED_TO_HAVE_BANK_ACCOUNT(110, "Transfer Type Need to have Bank Account"),
    CASH_TRANSFER_ONLINE_DISABLED(111, "Cash Transfer Online Disabled"),
    CUSTOMER_ID_NOT_MATCH(112, "Customer ID not match with To Account"),
    CASH_DAILY_WITHDRAW_LIMIT_EXCEEDED(113, "Daily Withdraw Limit Exceeded"),
    CASH_TRANSFER_BENEFICIARY_VALIDATION_FAILED(114, "To Account is not available in the Beneficiary list"),
    UNSOLICITED_EMPTY_ORDER_ID(115, "Unsolicited With Empty Order ID"),
    UNSOLICITED_RESTATE(116, "Unsolicited Restate Order"), UNSOLICITED_REJECTED_ORDER(117, "Unsolicited Reject Order"),
    UNSOLICITED_EXPIRED_ORDER(118, "Unsolicited Expire Order"),
    OFFLINE_CANCEL_REJECT(119, "OFFLINE ORDER CANCEL REJECT"),
    ORDER_ACTION_NOT_ALLOWED(120, "ORDER ACTION NOT ALLOWED"), INVALID_CHANNEL_ID(121, "CHANNEL ID INVALID"),
    CASSANDRA_QUERY_EXECUTE_ERROR(122, "CASSANDRA QUERY EXECUTION ERROR"),
    INVALID_MARGIN_COVERAGE(123, "Margin coverage ratio exceeded"), ORDER_ID_ALREADY_EXIST(124, "ORDERID ALREADY EXIST"),
    CASH_APPROVE_REJECT(125, "Cash transaction approve reject"),
    HOLDING_TRANSFER_REQ_FAILLED(126, "Holding Transfer Req Failed"),
    USER_ID_NOT_FOUND(127, "User Id not found"),
    EXCHANGE_ACC_NO_NOT_FOUND(128, "Exchange Acc Number Not Found"),
    INVALID_TRANSFER_QTY(129, "Invalid Transfer Quantity"),
    INVALID_AVG_PRICE(130, "Invalid AVG Price"),
    TRADING_ACNT_NOT_ALLOWED_SHARE_TRANSFER(131, "TRADING ACCOUNT NOT ALLOWED TO SHARE TRANSFER"),
    TRADING_ACNT_NOT_ALLOWED_WITHDRWA_BOTH(132, "Trading Account Not Allowed To Share Withdraow or both"),
    TRADING_ACNT_NOT_ALLOWD_SHARE_DEPOSIT_BOTH(133, "Trading Account not Allowed to Share Deposit or both"),
    TRADING_ACNT_NOT_ENOUGH_SHARES(134, "Insufficient Shares to Withdraw"),
    INVALID_PRICE(135, "Invalid Price"),
    ORDER_REJECT_NOT_ALLOWED(136, "Partially Filled order Can't Reject"),
    NO_SHARES_TO_WITHDRAW(137, "No Shares to Withdraw"),
    NO_PENDING_REQUEST_FOUND(138, "No Pending Changes found"),
    ORDER_EXECUTION_ALREADY_EXECUTED(139, "ORDER_EXECUTION_ALREADY_EXECUTED"),
    INVALID_TRANSACTION_TYPE(140, "INVALID_TRANSACTION_TYPE"),
    INVALID_QTY_TO_RELEASE(141, "INVALID_QTY_TO_RELEASE"),
    INVALID_ORDER_MAX_VALUE(142, "Exceed maximum order value"),
    ORDER_APPROVE_REJECT(143, "Order approve reject"),
    INVALID_SHARE_TO_RELEASE(144, "Insufficient Stocks to release"),
    INVALID_QUANTITY(145, "Invalid Quantity"),
    REVERSE_NOT_APPLICABLE(146, "Order does not have cum qty to reverse"),
    INVALID_ORDER_TYPE(147, "Invalid Order Type"),
    SHARIA_RESTRICTED_TRD_ACNT(148, "Sharia Restricted Trading Account"),
    POA_DOES_NOT_EXIST(149, "POA does not assigned"),
    DECIMAL_FORMAT_NOT_DEFINED(150, "DECIMAL_FORMAT_NOT_DEFINED"),
    STATUS_REQ_NOT_ALLOWED(151, "Status Request Not Allowed for Trading Market"),
    STATUS_REQ_FALIED(152, "Status Request Failed for Trading Market"),
    TRADING_MARKET_MANUAL_SUSPEND(153, "Trading Market Manually Suspended"),
    COMMISSION_OVERWRITE_IS_NOT_PERMITED(154, "Commission overwrite is not permited"),
    INVALID_RHT_SUBSCRIPTION_TIME(155, "Invalid RHT Subscription time"),
    INVALID_SYMBOL_MARKET_SEGMENT(156, "Invalid Market and Symbol Segment"),
    POA_NO_PRIVILEGES(157, "POA NO PRIVILEGES"),
    BROKER_MAPPING_NOT_FOUND_FOR_INS_EXCHANGES(158, "No Broker Mapping for Institute and Exchange"),
    IB_NOT_FOUND(160, "IB Not Found"),
    EOD_NOT_ALLOWED(159, "EOD is not Allowed for Trading Market"),
    INVALID_BENEFICIARY_TRN_TYPE(161, "Invalid Beneficiary transfer Type"),
    INVALID_TICK_SIZE(162, "Invalid Tick Size"),
    INVALID_SHORT_HOLDINGS(163, "Invalid Sort Holdings"),
    INSUFFICIENT_BASE_HOLDINGS(164, "INSUFFICIENT BASE HOLDINGS"),
    CASH_ACNT_NOT_ACTIVE(165, "Cash Account is not Active"),
    PARENT_TRD_ACNT_NOT_FOUND(166, "Parent Trading Account Not Found"),
    PARENT_ORDER_STATUS_STAGE(167, "Child order creation is possible only after accepting the desk order"),
    PARENT_ORDER_STATUS_PENDING(168, "Child orders are not accepted while desk order in pending status"),
    TRADING_ACCOUNT_MISMATCH(169, "Child order rejected since Child order trading number not equal to parent order trading number"),
    SYMBOL_MISMATCH(170, "Child order rejected since Child order symbol not equal to parent order symbol"),
    SIDE_MISMATCH(171, "Child order rejected since Child order side not equal to parent order side"),
    LIQUDATION_LEVEL_EXCEED(172, "Liquidation level exceed"),
    PARENT_ORDER_QUANTITY_VIOLATED(173, "Child order rejected since Not enough remaining quantity for this child order"),
    AUTO_LIQUIDATION_PROCESS(174, "Margin Liquidation pending"),
    OMSV_INVALID_ORDER_QTY_FOR_DISCLOSED_ENABLED(175, "Invalid order qty for disclosed enable"),
    OMSV_INVALID_DISCLOSED_VALUE(176, "Invalid order quantity"),
    CROSS_ORDER_REJECT(178, "Order is rejected - Cross Order"), //Depository Account is not allowed to trade with itself
    INVALID_ORD_STATUS(179, "Invalid Order Status "),
    NOT_ENOUGH_CHILD_ORD_QTY(180, "Not Enough child order qty "),
    UNSOLICITED_OUT_OF_SEQ_ORDER(181, "Unsolicited out of sequence order"),
    CASH_AND_HOLDING_TRANSACTION_NOT_ALLOWED(182, "Cash and Holdong transactions not allowed at this time"),
    INVALID_ORD_SIDE(183, "Invalid Order Side ");

    private String description;
    private int id;

    ErrorCodes(String description) {
        this.description = description;
    }

    ErrorCodes(int id, String description) {
        this(description);
        this.id = id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public ErrorCodes getErrorCode() {
        return this;
    }


}