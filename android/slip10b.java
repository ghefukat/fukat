Create a new Android Studio project with an Empty Activity template.

Add the following dependencies to the app/build.gradle file:


implementation 'androidx.appcompat:appcompat:1.3.1'
implementation 'androidx.recyclerview:recyclerview:1.2.1'
implementation 'androidx.cardview:cardview:1.0.0'
implementation 'androidx.sqlite:sqlite:2.1.0'


Create a Game model class to represent a game entity:

public class Game {
    private int gno;
    private String gname;
    private String type;
    private int no_of_players;

    public Game(int gno, String gname, String type, int no_of_players) {
        this.gno = gno;
        this.gname = gname;
        this.type = type;
        this.no_of_players = no_of_players;
    }

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNo_of_players() {
        return no_of_players;
    }

    public void setNo_of_players(int no_of_players) {
        this.no_of_players = no_of_players;
    }
}

Add a RecyclerView to the activity_main.xml layout file:

<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recycler_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />

Create a GameAdapter class to populate the RecyclerView with game data:

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {

    private List<Game> games;

    public GameAdapter(List<Game> games) {
        this.games = games;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_game, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Game game = games.get(position);
        holder.tvGno.setText(String.valueOf(game.getGno()));
        holder.tvGname.setText(game.getGname());
        holder.tvType.setText(game.getType());
        holder.tvNoOfPlayers.setText(String.valueOf(game.getNo_of_players()));
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvGno;
        public TextView tvGname;
        public TextView tvType;
        public TextView tvNoOfPlayers;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGno = itemView.findViewById(R.id.tv_gno);
            tvGname = itemView.findViewById(R.id.tv_gname);
            tvType = itemView.findViewById(R.id.tv_type);
            tvNoOfPlayers = itemView.findViewById(R.id.tv_no_of_players);
        }
    }
}

Add a layout file for the game item to the res/layout folder:

<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/card_view"
    android:layout_width="match_parent"
    android:
