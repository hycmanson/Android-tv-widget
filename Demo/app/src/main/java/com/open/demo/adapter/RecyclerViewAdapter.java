package com.open.demo.adapter;

import java.util.ArrayList;
import java.util.List;

import com.open.demo.R;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecyclerViewAdapter extends RecyclerView.Adapter<GridViewHolder> {
	private final List<String> labels;

	public RecyclerViewAdapter(int count) {
		this.labels = new ArrayList<String>(count);
		for (int i = 0; i < count; i++) {
			labels.add(String.valueOf(i));
		}
	}

	@Override
	public int getItemCount() {
		return labels.size();
	}

	@Override
	public void onBindViewHolder(GridViewHolder gh, int pos) {
		TextView textView = (TextView) gh.tv;
		textView.setText("item " + labels.get(pos));
	}

	@Override
	public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview_view, parent, false);
		return new GridViewHolder(view);
	}

}
