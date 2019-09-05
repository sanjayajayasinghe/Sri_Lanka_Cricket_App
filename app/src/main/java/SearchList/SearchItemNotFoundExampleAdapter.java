package SearchList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.srilankacricketappv1.R;

import java.util.ArrayList;
import java.util.List;

public class SearchItemNotFoundExampleAdapter extends RecyclerView.Adapter<SearchItemNotFoundExampleAdapter.ExampleViewHolder> implements Filterable {

    private List<SearchItemNotFoundExample> searchItemNotFoundExampleList;
    private List<SearchItemNotFoundExample> searchItemNotFoundExampleListFull;

    class ExampleViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;


        public ExampleViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            textView1 = itemView.findViewById(R.id.text_view1);
        }
    }

    public SearchItemNotFoundExampleAdapter( List<SearchItemNotFoundExample> searchItemNotFoundExampleList){
        this.searchItemNotFoundExampleList=searchItemNotFoundExampleList;
        searchItemNotFoundExampleListFull=new ArrayList<>(searchItemNotFoundExampleList);
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item_not_found,
                parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {

        SearchItemNotFoundExample currentItem=searchItemNotFoundExampleList.get(position);
        holder.imageView.setImageResource(currentItem.getImageResource());
        holder.textView1.setText(currentItem.getText1());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<SearchItemNotFoundExample> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(searchItemNotFoundExampleListFull);
            } else {
               // String filterPattern = constraint.toString().toLowerCase().trim();

                for (SearchItemNotFoundExample item : searchItemNotFoundExampleListFull) {
                        filteredList.add(item);

                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            searchItemNotFoundExampleList.clear();
            searchItemNotFoundExampleList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

}
