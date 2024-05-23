#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.customer;

/**
 * CustomerType
 *
 */
public enum CustomerType {
    POTENTIAL,
    INTENTIONAL,
    IMPORTANT,
    VIP;
}
