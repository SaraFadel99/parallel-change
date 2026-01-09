using System.Collections.Generic;
using System.Linq;

namespace ParallelAndNarrowChange.Field
{
    public class ShoppingCart
    
    {
        private decimal price;
        private  List<int> prices = new List<int>();

        public decimal CalculateTotalPrice(){
            return price;
        }

        public decimal CalculateTotalPrices()
        {
            return prices.Sum();
        }

        public bool HasDiscount(){
            return price > 100;
        }

        public bool HasDiscount(List<decimal> prices)
        {
            bool checkForDiscount = prices.Sum()>100;
            return checkForDiscount;
        }
        public void Add(int aPrice)
        {
            this.price = aPrice;
        }
        public void Add(List<int> prices)
        {
            this.prices = prices;
        }

        public int NumberOfProducts(){
            return 1;
        }

        public int NumberOfProductsItems()
        {
            return prices.Count();
        }
    }
}
